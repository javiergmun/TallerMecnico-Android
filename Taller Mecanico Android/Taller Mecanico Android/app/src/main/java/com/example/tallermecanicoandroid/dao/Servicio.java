package com.example.tallermecanicoandroid.dao;


import android.net.Uri;

public class Servicio {
    private Uri icono;
    private Uri imagen;
    private String titulo;
    private String descCorta;
    private String descLarga;
    private Double precio;

    public Servicio() {
    }

    public Servicio(Uri icono, Uri imagen, String titulo, String descCorta, String descLarga, Double precio) {
        this.icono = icono;
        this.imagen = imagen;
        this.titulo = titulo;
        this.descCorta = descCorta;
        this.descLarga = descLarga;
        this.precio = precio;
    }

    public Uri getIcono() {
        return icono;
    }

    public void setIcono(Uri icono) {
        this.icono = icono;
    }

    public Uri getImagen() {
        return imagen;
    }

    public void setImagen(Uri imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescCorta() {
        return descCorta;
    }

    public void setDescCorta(String descCorta) {
        this.descCorta = descCorta;
    }

    public String getDescLarga() {
        return descLarga;
    }

    public void setDescLarga(String descLarga) {
        this.descLarga = descLarga;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
