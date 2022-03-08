package com.example.tallermecanicoandroid.model;

public class Mecanico {

    private long id;

    public Mecanico(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private Double salario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
