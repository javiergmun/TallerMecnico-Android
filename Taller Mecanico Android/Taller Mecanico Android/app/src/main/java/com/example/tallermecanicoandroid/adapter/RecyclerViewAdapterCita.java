package com.example.tallermecanicoandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tallermecanicoandroid.Fragment_servicio_detalle;
import com.example.tallermecanicoandroid.R;
import com.example.tallermecanicoandroid.model.Cita;
import com.example.tallermecanicoandroid.model.Servicio;

import java.util.List;


public class RecyclerViewAdapterCita extends RecyclerView.Adapter<RecyclerViewAdapterCita.ViewHolder> {


    List<Cita> servicioList;
    Context context;



    public RecyclerViewAdapterCita(List<Cita> servicioList, Context context) {
        this.servicioList = servicioList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cita_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Cita item = servicioList.get(position);

        //Poner el textview correspondiente con el atributo al que corresponda
        holder.mecanico.setText(item.getMecanico().getNombre());
        holder.hora.setText(item.getFecha().toString());

        /*
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AppCompatActivity activity = (AppCompatActivity)view.getContext();
                Fragment_servicio_detalle demoFragment = new Fragment_servicio_detalle(item, context);
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, demoFragment).addToBackStack(null).commit();


            }
        });


         */


    }

    @Override
    public int getItemCount() {
        return servicioList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mecanico, hora;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mecanico = itemView.findViewById(R.id.nombreMecanico);
            hora = itemView.findViewById(R.id.horaDisponible);

        }

    }

}
