package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Prestamo {
    private Date fechaInicio;
    private Copia copia;
    private Lector lector;
    private String estado;

    public Prestamo(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Prestamo(Date fechaInicio, Copia copia, Lector lector) {
        this.fechaInicio = fechaInicio;
        this.copia = copia;
        this.lector = lector;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void imponerMulta() {
        if (Objects.equals(estado, "activo") && returnDias() < -30){
            this.lector.setDiasMultas(returnDias() * -2);
        }

    }

    public Integer returnDias(){
        Date fecha = this.fechaInicio;

        LocalDate now = LocalDate.now();

        Date ahora = java.util.Date.from(now.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

        int dias= (int) ((ahora.getTime()-fecha.getTime())/86400000);

        System.out.println(dias);

        return dias;
    }

    public void cerrarPrestamo(){

    }

}


/*
String pattern = "yyyy-MM-dd";
        SimpleDateFormat formato = new SimpleDateFormat(pattern);
        Date date = formato.parse("2022-03-26");
 */