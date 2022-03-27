package com.company;

public class Copia {

    private Libro libro;
    private int idCopia;
    private String estado;

    public Copia(Libro libro, int idCopia, String estado) {
        this.libro = libro;
        this.idCopia = idCopia;
        this.estado = estado;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getIdCopia() {
        return idCopia;
    }

    public void setIdCopia(int idCopia) {
        this.idCopia = idCopia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



}
