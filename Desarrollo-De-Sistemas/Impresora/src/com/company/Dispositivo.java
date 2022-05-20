package com.company;

public class Dispositivo {

    private int id;
    private String nombre;


    public Dispositivo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getIdDispositivo() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

