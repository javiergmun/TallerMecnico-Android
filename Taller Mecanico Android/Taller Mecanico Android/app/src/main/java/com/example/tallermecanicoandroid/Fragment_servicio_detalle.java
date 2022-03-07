package com.example.tallermecanicoandroid;

import static com.example.tallermecanicoandroid.UriConverters.fromString;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tallermecanicoandroid.model.Servicio;

import java.time.LocalDate;
import java.util.Date;

public class Fragment_servicio_detalle extends Fragment implements ActivityCommunications {

    private Servicio servicio =new Servicio();
    private Date fechaCita;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
        View separador  = view.findViewById(R.id.divider);
        CalendarView calendario = view.findViewById(R.id.calendario);


        titulo.setText(servicio.getTipo());
        precio.setText(String.valueOf(servicio.getPrecio()));
        imageView.setImageURI(fromString(servicio.getImagen()));

        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {

                   fechaCita= new Date(year, month, dayOfMonth);
            }
        });

        return view;
    }


    @Override
    public void onServiciolistItemSelected(Servicio servicio) {

        this.servicio = servicio;

    }
}
