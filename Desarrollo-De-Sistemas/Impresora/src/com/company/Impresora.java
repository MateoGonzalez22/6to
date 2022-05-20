package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Impresora {

    private ArrayList<Impresion> colaDeImpresiones;
    private ArrayList<Dispositivo> dispositivosConectados;
    private static Impresora instance;

    public ArrayList<Impresion> getColaDeImpresiones() {
        return colaDeImpresiones;
    }

    public void setColaDeImpresiones(ArrayList<Impresion> colaDeImpresiones) {
        this.colaDeImpresiones = colaDeImpresiones;
    }

    public ArrayList<Dispositivo> getDispositivosConectados() {
        return dispositivosConectados;
    }

    public void setDispositivosConectados(ArrayList<Dispositivo> dispositivosConectados) {
        this.dispositivosConectados = dispositivosConectados;
    }

    public Impresora getInstance() {
        return instance;
    }

    public void setInstance(Impresora instance) {
        this.instance = instance;
    }



    private Impresora(){
        this.colaDeImpresiones = new ArrayList<>();
        this.dispositivosConectados = new ArrayList<>();
        this.instance = null;
    }

    public static Impresora crearImpresora(){
        if (instance != null){
            return instance;
        }

        Impresora impresora = new Impresora();
        impresora.setInstance(impresora);
        return impresora;

    }

    public boolean realizarImpresion(int idImpresion){

        for (Impresion impresion : colaDeImpresiones) {
            if(impresion.getId() == idImpresion){
                System.out.println("IMPRIMIR!");
                return true;
            }
        }
        System.out.println("No se encontro el archivo!");
        return false;

    }

    public boolean agregarImpresion(Impresion impresion){
        try{
            this.colaDeImpresiones.add(impresion);
        }catch(Exception error){
            return false;
        }
        return true;
    }

}
