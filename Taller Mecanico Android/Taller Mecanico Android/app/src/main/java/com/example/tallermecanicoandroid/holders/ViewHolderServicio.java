package com.example.tallermecanicoandroid.holders;

import com.example.tallermecanicoandroid.Interfaz;
import com.example.tallermecanicoandroid.MainActivity;
import com.example.tallermecanicoandroid.R;
import com.example.tallermecanicoandroid.dao.Servicio;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ViewHolderServicio extends RecyclerView.ViewHolder {
    private ImageView imagenServicio;
    private TextView lblTitulo;
    private TextView lblDescripcion;


    public ViewHolderServicio(@NonNull View itemView) {
        super(itemView);
        imagenServicio = itemView.findViewById(R.id.imagenServicio);
        lblTitulo = itemView.findViewById(R.id.titulo);
        lblDescripcion = itemView.findViewById(R.id.descripcion);

    }

    public void render(Servicio servicio, Interfaz interfaz) {
        imagenServicio.setImageURI(servicio.getImagen());
        lblTitulo.setText(servicio.getTitulo());
        lblDescripcion.setText(servicio.getDescCorta());

    }

    public ImageView getImagenServicio() {
        return imagenServicio;
    }

    public void setImagenServicio(ImageView imagenServicio) {
        this.imagenServicio = imagenServicio;
    }

    public TextView getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(TextView lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public TextView getLblDescripcion() {
        return lblDescripcion;
    }

    public void setLblDescripcion(TextView lblDescripcion) {
        this.lblDescripcion = lblDescripcion;
    }

}
