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
import com.example.tallermecanicoandroid.model.Cita;

import java.util.List;

public class RecyclerViewAdapterCita {
        /*
        extends RecyclerView.Adapter<RecyclerViewAdapterCita.ViewHolder>{


    List<Cita> citaList;
    Context context;

    public RecyclerViewAdapterCita(List<Cita> citaList, Context context) {
        this.citaList = citaList;
        this.context = context;
    }

    //Poner en el inflate el xml del item (como se muestra)

    @NonNull
    @Override
    public RecyclerViewAdapterCita.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inicializar el view con la lista de elementos
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_elem,parent,false);
        return new RecyclerViewAdapterCita.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterCita.ViewHolder holder, int position) {

        Cita item = citaList.get(position);

        //Poner el textview correspondiente con el atributo al que corresponda
        holder.textViewFecha.setText(item.getFecha().toString());
        holder.textViewUsuario.setText(item.getUsuario().getUsername());
        holder.textViewMecanico.setText(item.getMecanico().getNombre());
        holder.textViewServicio.setText(item.getServicio().getTipo());

    }


    @Override
    public int getItemCount() {
        return citaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewFecha,textViewUsuario,textViewMecanico, textViewServicio;    //Poner los elementos del xml


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textViewFecha = itemView.findViewById(R.id.textView_dni);
            textViewUsuario = itemView.findViewById(R.id.textView_username);
            textViewMecanico = itemView.findViewById(R.id.textView_mecanico);
            textViewServicio = itemView.findViewById(R.id.textView_telefono);

        }
    }

         */
}
