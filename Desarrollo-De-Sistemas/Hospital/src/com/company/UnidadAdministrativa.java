package com.company;

import java.util.ArrayList;

public class UnidadAdministrativa extends Base{

    private ArrayList<BaseSimple> basesSimples;

    public ArrayList<BaseSimple> getBasesSimples() {
        return basesSimples;
    }

    public void setBases(ArrayList<BaseSimple> basesSimples) {
        this.basesSimples = basesSimples;
    }

    public UnidadAdministrativa(String nombre, ArrayList<BaseSimple> basesSimples) {
        super(nombre);
        this.basesSimples = basesSimples;
    }

    public int calcularCantidadAmbulancias(){
        int cantidadAmbulancias = 0;

        for (BaseSimple base : basesSimples) {
            cantidadAmbulancias += base.getCantidadDeAmbulancias();
        }

        return cantidadAmbulancias;
    }

    public float calcularTiempoMedioAsistencia(){

        float tiempoMedio = 0;
        float tiempo = 0;
        int i = 0;

        for (BaseSimple base : basesSimples) {
            tiempo += base.getTiempoMedioAsistencia();
            i++;
        }

        return tiempo/i;
    }
}
