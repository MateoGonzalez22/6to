package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) throws ParseException {


        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formato = new SimpleDateFormat(pattern);
        Date fechaInicio = formato.parse("2022-03-27");

        Prestamo prestamo = new Prestamo();

    }

}



/*
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formato = new SimpleDateFormat(pattern);
        Date fecha = formato.parse("2022-03-27");

        LocalDate now = LocalDate.now();

        Date ahora = java.util.Date.from(now.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

        int dias= (int) ((ahora.getTime()-fecha.getTime())/86400000);

        System.out.println(dias);
 */