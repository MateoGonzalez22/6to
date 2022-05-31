package com.company;

public class Main {

    public static void main(String args[]){
        Cliente cliente = new Cliente("fjnesf","jfoiesoif","joifesjfes");
        Transportista transportista = new Transportista("oifsjfes","jfiejsifes");
        Envio envio = new Envio("larga",20,cliente,transportista,new EstrategiaEnvioLargo());
        System.out.println(envio.getEstrategia().calcularCostos(envio));
    }

}
