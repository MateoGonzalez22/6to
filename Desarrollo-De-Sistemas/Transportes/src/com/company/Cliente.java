package com.company;

public class Cliente {
    private String nombre;
    private String dni;
    private String metodoPago;

    public Cliente(String nombre, String dni, String metodoPago) {
        this.nombre = nombre;
        this.dni = dni;
        this.metodoPago = metodoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
