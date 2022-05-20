package com.company;

public class BaseSimple extends Base{


    private int cantidadDeAmbulancias;
    private float tiempoMedioAsistencia;

    public int getCantidadDeAmbulancias() {
        return cantidadDeAmbulancias;
    }
    public void setCantidadDeAmbulancias(int cantidadDeAmbulancias) {
        this.cantidadDeAmbulancias = cantidadDeAmbulancias;
    }
    public float getTiempoMedioAsistencia() {
        return tiempoMedioAsistencia;
    }

    public void setTiempoMedioAsistencia(float tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }

    public BaseSimple(int cantidadDeAmbulancias, float tiempoMedioAsistencia, String nombre) {
        super(nombre);
        this.cantidadDeAmbulancias = cantidadDeAmbulancias;
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }
}
