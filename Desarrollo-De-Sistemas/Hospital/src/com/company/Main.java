package com.company;

public class Main {

    public static void main(String[] args) {
        UnidadAdministrativa unidadAdministrativa = new UnidadAdministrativa("hola");

        Base base = new Base("noienefs");
        BaseSimple baseSimple = new BaseSimple(5,40.5f,"joifjsefes");
        BaseSimple baseSimple2 = new BaseSimple(5,40.5f,"joifjsefes");

        unidadAdministrativa.getBases().add(baseSimple);
        unidadAdministrativa.getBases().add(base);
        unidadAdministrativa.getBases().add(baseSimple2);

        unidadAdministrativa.calcularTiempoMedioAsistencia();

    }
}