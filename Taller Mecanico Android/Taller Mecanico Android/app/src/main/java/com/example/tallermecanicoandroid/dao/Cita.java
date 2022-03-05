package com.example.tallermecanicoandroid.dao;

public class Cita {
    private String mecanico;
    private String franjaHoraria;

    public Cita() {
    }

    public Cita(String mecanico, String franja) {
        this.mecanico = mecanico;
        this.franjaHoraria = franja;

    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setFranjaHoraria(String franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }
}
