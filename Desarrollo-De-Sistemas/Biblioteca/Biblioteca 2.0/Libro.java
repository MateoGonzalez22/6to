package com.company;

import java.util.HashSet;

public class Libro {
    private String nombre;
    private int año;
    private HashSet<Autor> autores;
    private String categoria;
    private String editorial;

    public Libro(String nombre, int año, HashSet<Autor> autores, String categoria, String editorial) {
        this.nombre = nombre;
        this.año = año;
        this.autores = autores;
        this.categoria = categoria;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int ano) {
        this.año = año;
    }

    public HashSet<Autor> getAutores() {
        return autores;
    }

    public void setAutores(HashSet<Autor> autores) {
        this.autores = autores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
