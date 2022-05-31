package com.company;

import java.util.ArrayList;

public class UnidadAdministrativa extends Base{

    private ArrayList<Base> bases;

    public ArrayList<Base> getBases() {
        return bases;
    }

    public void setBases(ArrayList<Base> bases) {
        this.bases = bases;
    }

    public UnidadAdministrativa(String nombre) {
        super(nombre);
        this.bases = new ArrayList<>();
    }

    public int calcularCantidadAmbulancias(){
        int cantidadAmbulancias = 0;


        return cantidadAmbulancias;
    }

    public float calcularTiempoMedioAsistencia(){

        float tiempoMedio = 0;
        float tiempo = 0;
        int i = 0;

        for (Base base : bases) {
            System.out.println(base.getClass());

            i++;
        }

        return tiempo/i;
    }
}
