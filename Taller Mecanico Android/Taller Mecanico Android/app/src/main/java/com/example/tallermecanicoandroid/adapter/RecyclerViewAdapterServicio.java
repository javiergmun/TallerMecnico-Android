package com.example.tallermecanicoandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tallermecanicoandroid.R;
import com.example.tallermecanicoandroid.model.Servicio;

import java.util.List;

public class RecyclerViewAdapterServicio extends RecyclerView.Adapter<RecyclerViewAdapterServicio.ViewHolder> {


    List<Servicio> servicioList;
    Context context;



    public RecyclerViewAdapterServicio(List<Servicio> servicioList, Context context) {
        this.servicioList = servicioList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.servicio_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Servicio item = servicioList.get(position);

        //Poner el textview correspondiente con el atributo al que corresponda
        holder.tituloServicio.setText(item.getTipo());
        holder.descripcionServicio.setText(item.getDescripcion());

        //Para tratar la imagen con glide
        Glide.with(context)
                .load(item.getImagen())
                .into(holder.imageViewServicio);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //AL HACER CLICK EN UN ITEM
                //QUEREMOS QUE SALGA EL FRAGMENTO servicio detalle
            }
        });




    }

    @Override
    public int getItemCount() {
        return servicioList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tituloServicio, descripcionServicio;
        ImageView imageViewServicio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tituloServicio = itemView.findViewById(R.id.nombreServicio);
            descripcionServicio = itemView.findViewById(R.id.descripcionServicio);
            imageViewServicio = itemView.findViewById(R.id.imageView);

        }

    }



}
