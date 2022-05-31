package com.company;

public class EstrategiaEnvioLargo extends CalculadorCostos {
    @Override
    public float calcularCostos(Envio envio){
        return envio.getPesoPaquete() * 4;
    }
}
