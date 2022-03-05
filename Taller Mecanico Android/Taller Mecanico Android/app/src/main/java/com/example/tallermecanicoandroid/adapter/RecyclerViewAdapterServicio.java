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
import com.example.tallermecanicoandroid.model.Servicio;

import java.util.List;

public class RecyclerViewAdapterServicio {
        //extends RecyclerView.Adapter<RecyclerViewAdapterServicio.ViewHolder>{


    List<Servicio> servicioList;
    Context context;

    public RecyclerViewAdapterServicio(List<Servicio> servicioList, Context context) {
        this.servicioList = servicioList;
        this.context = context;
    }

    //Poner en el inflate el xml del item (como se muestra)
/*
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inicializar el view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_elem,parent,false);
        return new ViewHolder(view);
    }

 */
/*
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Servicio item = servicioList.get(position);

        //Poner el textview correspondiente con el atributo al que corresponda
        holder.textViewPrecio.setText(item.getPrecio());
        holder.textViewTipo.setText(item.getTipo());
        holder.textViewtextViewTiempo.setText(item.getTiempo());
        holder.textViewDescripcion.setText(item.getDescription());

        //Para tratar la imagen con glide
        Glide.with(context)
                .load(item.getImage())
                .into(holder.imageViewServicio);

    }

 */
/*
    @Override
    public int getItemCount() {
        return servicioList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewPrecio, textViewTipo, textViewTiempo, textViewDescripcion;    //Poner los elementos del xml
        ImageView imageViewServicio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textViewPrecio = itemView.findViewById(R.id.textView_precio);
            textViewtextViewTipo = itemView.findViewById(R.id.textView_tipo);
            textViewtextViewtextViewTiempo = itemView.findViewById(R.id.textView_tiempo);
            textViewPrecioDescripcion = itemView.findViewById(R.id.textView_descripcion);
            imageViewServicio = itemView.findViewById(R.id.imageView_servicio);

        }
    }

 */

}
