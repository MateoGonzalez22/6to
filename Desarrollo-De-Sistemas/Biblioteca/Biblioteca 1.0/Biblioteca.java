package com.company;


import java.util.HashSet;

public class Biblioteca {
    private HashSet<Copia> copias;
    private HashSet<Prestamo> prestamos;


    public Biblioteca(HashSet<Copia> copias, HashSet<Prestamo> prestamos) {
        this.copias = copias;
        this.prestamos = prestamos;
    }

    public HashSet<Copia> getCopias() {
        return copias;
    }

    public void setCopias(HashSet<Copia> copias) {
        this.copias = copias;
    }

    public HashSet<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(HashSet<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}
