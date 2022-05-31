package com.company;

public class EstrategiaEnvioLocal extends CalculadorCostos{

    @Override
    public float calcularCostos(Envio envio){
        return envio.getPesoPaquete() * 2;
    }
}
