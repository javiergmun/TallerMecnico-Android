package com.example.tallermecanicoandroid.holders;

import com.example.tallermecanicoandroid.Interfaz;
import com.example.tallermecanicoandroid.R;
import com.example.tallermecanicoandroid.dao.Cita;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderHora extends RecyclerView.ViewHolder {
    private ImageView imagenFlecha;
    private TextView lblMecanico;
    private TextView lblHora;


    public ViewHolderHora(@NonNull View itemView) {
        super(itemView);
        imagenFlecha = itemView.findViewById(R.id.flecha);
        lblMecanico = itemView.findViewById(R.id.mecanico);
        lblHora = itemView.findViewById(R.id.hora);


    }

    public void render(Cita cita, Interfaz interfaz) {
        imagenFlecha.setImageResource(R.drawable.flecha);
        lblMecanico.setText(cita.getMecanico());
        lblHora.setText(cita.getFranjaHoraria());

    }

    public ImageView getImagenFlecha() {
        return imagenFlecha;
    }

    public void setImagenFlecha(ImageView imagenFlecha) {
        this.imagenFlecha = imagenFlecha;
    }

    public TextView getLblMecanico() {
        return lblMecanico;
    }

    public void setLblMecanico(TextView lblMecanico) {
        this.lblMecanico = lblMecanico;
    }

    public TextView getLblHora() {
        return lblHora;
    }

    public void setLblHora(TextView lblHora) {
        this.lblHora = lblHora;
    }
}
