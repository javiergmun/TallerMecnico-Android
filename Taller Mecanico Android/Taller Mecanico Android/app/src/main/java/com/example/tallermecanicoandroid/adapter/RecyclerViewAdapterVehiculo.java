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
import com.example.tallermecanicoandroid.model.Vehiculo;

import java.util.List;

public class RecyclerViewAdapterVehiculo {
        /*
                extends RecyclerView.Adapter<RecyclerViewAdapterVehiculo.ViewHolder>{


    List<Vehiculo> vehiculoList;
    Context context;

    public RecyclerViewAdapterVehiculo(List<Vehiculo> vehiculoList, Context context) {
        this.vehiculoList = vehiculoList;
        this.context = context;
    }

    //Poner en el inflate el xml del item (como se muestra)

    @NonNull
    @Override
    public RecyclerViewAdapterVehiculo.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inicializar el view con la lista de elementos
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_elem,parent,false);
        return new RecyclerViewAdapterVehiculo.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterVehiculo.ViewHolder holder, int position) {

        Vehiculo item = vehiculoList.get(position);

        //Poner el textview correspondiente con el atributo al que corresponda
        holder.textViewMarca.setText(item.getMarca());
        holder.textViewModelo.setText(item.getModelo());
        holder.textViewMatricula.setText(item.getMatricula());
        holder.textViewColor.setText(item.getColor());

        //Para tratar la imagen con glide
        Glide.with(context)
                .load(item.getImage())
                .into(holder.imageViewVehiculo);

    }


    @Override
    public int getItemCount() {
        return VehiculoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewMarca,textViewModelo,textViewMatricula, textViewColor;    //Poner los elementos del xml
        ImageView imageViewVehiculo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textViewMarca = itemView.findViewById(R.id.textView_marca);
            textViewModelo = itemView.findViewById(R.id.textView_,odelo);
            textViewMatricula = itemView.findViewById(R.id.textView_matricula);
            textViewColor = itemView.findViewById(R.id.textView_color);
            imageViewVehiculo = itemView.findViewById(R.id.imageView_vehiculo);

        }
    }

         */
}
