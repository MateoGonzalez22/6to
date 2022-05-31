package com.company;

public class EstrategiaUPS extends CalculadorCostos{

    @Override
    public float calcularCostos(Envio envio){
        return envio.getPesoPaquete() * 7.5f;
    }
}
