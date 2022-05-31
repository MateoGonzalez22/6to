package com.company;

public class EstrategiaFedEx extends CalculadorCostos{
    @Override
    public float calcularCostos(Envio envio){
        return envio.getPesoPaquete() * 8;
    }
}
