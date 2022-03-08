package com.example.tallermecanicoandroid;

import static com.example.tallermecanicoandroid.UriConverters.fromString;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.tallermecanicoandroid.model.Servicio;

import java.time.LocalDate;
import java.util.Date;

public class Fragment_servicio_detalle extends Fragment {

    private Servicio servicio;
    private Date fechaCita;
    private Context context;


    public Fragment_servicio_detalle(Servicio servicio, Context context) {
        this.servicio = servicio;
        this.context = context;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_servicio_detalle, container, false);

        TextView titulo = view.findViewById(R.id.lblNombreServicio);
        ImageView imageView = view.findViewById(R.id.imageServicio);
        ImageView s1 = view.findViewById(R.id.star1);
        ImageView s2 = view.findViewById(R.id.star2);
        ImageView s3 = view.findViewById(R.id.star3);
        ImageView s4 = view.findViewById(R.id.star4);
        ImageView s5 = view.findViewById(R.id.star5);
        TextView precio = view.findViewById(R.id.lblPrecio);
        Button boton = view.findViewById(R.id.buttonOkCita);
        View separador  = view.findViewById(R.id.divider);
        CalendarView calendario = view.findViewById(R.id.calendario);



        titulo.setText(servicio.getTipo());
        precio.setText(String.valueOf(servicio.getPrecio()));

        Glide.with(context)
                .load(servicio.getImagen())
                .into(imageView);

        //imageView.setImageURI(fromString(servicio.getImagen()));


       calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {

                   fechaCita= new Date(year, month, dayOfMonth);
                Log.i("fecha",fechaCita.toString());


            }


       });

       boton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               AppCompatActivity activity = (AppCompatActivity)view.getContext();
               Fragment_cita demoFragment = new Fragment_cita(fechaCita);
               activity.getSupportFragmentManager().beginTransaction().replace(R.id.const_detalleServicio, demoFragment).addToBackStack(null).commit();

           }
       });


        return view;
    }

}
