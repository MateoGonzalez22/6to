package com.company;

public class Lector {
    private int dni;
    private int cantidad;
    private int diasMultas;

    public Lector(int dni, int cantidad, int diasMultas) {
        this.dni = dni;
        this.cantidad = cantidad;
        this.diasMultas = diasMultas;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDiasMultas() {
        return diasMultas;
    }

    public void setDiasMultas(int diasMultas) {
        this.diasMultas = diasMultas;
    }
}
