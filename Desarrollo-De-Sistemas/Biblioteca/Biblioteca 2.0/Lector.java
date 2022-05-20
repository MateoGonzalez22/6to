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


    /*Lector lector1 = new Lector(33565656, 0, 0);
    Lector lector2 = new Lector(99768588, 0, 0);
    Lector lector3 = new Lector(77373756, 0, 0);
    Lector lector4 = new Lector(43743736, 0, 0);
    Lector lector5 = new Lector(74373347, 0, 0);
    Lector lector6 = new Lector(62625623, 0, 0);
    Lector lector7 = new Lector(13458586, 0, 0);*/
}
