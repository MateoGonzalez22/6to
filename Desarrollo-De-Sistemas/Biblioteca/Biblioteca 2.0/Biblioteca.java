package com.company;


import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Biblioteca {
    private HashSet<Copia> copias;
    private HashSet<Prestamo> prestamos;
    private HashSet<Lector> lectores;

    public Biblioteca() {
        this.copias = new HashSet<>();
        this.prestamos = new HashSet<>();
        this.lectores = new HashSet<>();
    }

    public HashSet<Copia> getCopias() {
        return copias;
    }

    public void setCopias(HashSet<Copia> copias) {
        this.copias = copias;
    }

    public HashSet<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(HashSet<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public HashSet<Lector> getLectores() {
        return lectores;
    }

    public void setLectores(HashSet<Lector> lectores) {
        this.lectores = lectores;
    }

    Scanner stringInput = new Scanner(System.in);
    Scanner intInput = new Scanner(System.in);


    public void sistemaBiblioteca() throws ParseException {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formato = new SimpleDateFormat(pattern);

        Autor autor1 = new Autor("Jose", formato.parse("1960-11-12"), "Peru");
        Autor autor2 = new Autor("Juan", formato.parse("1933-05-15"), "Argentina");
        Autor autor3 = new Autor("Mateo", formato.parse("1980-05-20"), "Uruguay");
        Autor autor4 = new Autor("Nacho", formato.parse("1970-05-01"), "Bolivia");
        Autor autor5 = new Autor("Pepe", formato.parse("1960-12-10"), "Colombia");
        HashSet<Autor> autores = new HashSet<Autor>();
        autores.add(autor1);

        Libro libro1 = new Libro("El faro", 2000, autores, "Accion", "EDITORIAL");
        Libro libro2 = new Libro("Frin", 2000, autores, "Accion", "EDITORIAL");
        Libro libro3 = new Libro("El Eternauta", 2000, autores, "Accion", "EDITORIAL");
        Libro libro4 = new Libro("Naruto", 2000, autores, "Accion", "EDITORIAL");
        Libro libro5 = new Libro("Los tres chiflados", 2000, autores, "Accion", "EDITORIAL");
        Libro libro6 = new Libro("Condorito", 2000, autores, "Accion", "EDITORIAL");


        Lector lector1 = new Lector(33565656, 0, 0);
        Lector lector2 = new Lector(99768588, 0, 0);
        Lector lector3 = new Lector(77373756, 0, 0);
        Lector lector4 = new Lector(43743736, 0, 0);
        Lector lector5 = new Lector(74373347, 0, 0);
        Lector lector6 = new Lector(62625623, 0, 0);
        Lector lector7 = new Lector(13458586, 0, 0);

        lectores.add(lector1);
        lectores.add(lector2);
        lectores.add(lector3);
        lectores.add(lector4);
        lectores.add(lector5);
        lectores.add(lector6);
        lectores.add(lector7);


        Copia copia1 = new Copia(libro1, 1, "cerrado");
        Copia copia2 = new Copia(libro2, 2, "cerrado");
        Copia copia3 = new Copia(libro3, 3, "cerrado");
        Copia copia4 = new Copia(libro4, 4, "cerrado");
        Copia copia5 = new Copia(libro5, 5, "cerrado");
        Copia copia6 = new Copia(libro6, 6, "cerrado");

        copias.add(copia1);
        copias.add(copia2);
        copias.add(copia3);
        copias.add(copia4);
        copias.add(copia5);
        copias.add(copia6);

        Prestamo prestamo1 = new Prestamo(formato.parse("2022-03-10"), copia1, lector1, "activo");
        Prestamo prestamo2 = new Prestamo(formato.parse("2022-05-27"), copia2, lector2, "activo");
        Prestamo prestamo3 = new Prestamo(formato.parse("2022-04-27"), copia3, lector3, "activo");
        Prestamo prestamo4 = new Prestamo(formato.parse("2022-03-30"), copia4, lector4, "activo");


        prestamos.add(prestamo1);
        prestamos.add(prestamo2);
        prestamos.add(prestamo3);
        prestamos.add(prestamo4);

        while (true){

            System.out.println("\n- SISTEMA BIBLIOTECA -\n\n");
            System.out.println("Para salir ingrese 0\n\n");
            System.out.println("1 - Imponer multas\n");
            System.out.println("2 - Ver Prestamos no devueltos\n");
            System.out.println("3 - Ver 2 Libros con mayor multa\n");
            System.out.println("4 - Crear un prestamo\n");
            System.out.println("5 - Cerrar un prestamo\n");
            int input = -1;
            try {
                input = intInput.nextInt();
            } catch (Exception e) {
                System.out.println("Debe ingresar un número");
            }
            if (input == 0){
                break;
            }
            else if (input == 1) {
                imponerMultas();
            }
            else if(input == 2){
                prestamosNoDevueltos();
            }
            else if(input == 3){
                dosLibrosConMayorMulta();
            }
            else if(input == 4){
                crearPrestamo();
            }
            else if(input == 5) {
                cerrarPrestamo();
            }
        }
    }


    public void imponerMultas(){
        LocalDate now = LocalDate.now();
        Date ahora = java.util.Date.from(now.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

        for (Prestamo prestamo : prestamos) {
            Date fechaInicio = prestamo.getFechaInicio();
            int dias= (int) ((ahora.getTime()-fechaInicio.getTime())/86400000);

            if (dias < 0){
                Lector lector = prestamo.getLector();
                lector.setDiasMultas(dias * -2);
                System.out.println("Lector: " + lector.getDni() + "tiene " + lector.getDiasMultas() + " dias de multa");
            }

        }

    }

    public void prestamosNoDevueltos() {
        LocalDate now = LocalDate.now();
        Date ahora = java.util.Date.from(now.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

        int i = 0;
        System.out.println("\nPrestamos NO DEVUELTOS: \n");
        for (Prestamo prestamo : prestamos) {
            i += 1;
            if(Objects.equals(prestamo.getEstado(), "activo")){

                System.out.println(i + " - Prestamo con fecha de inicio: " + prestamo.getFechaInicio());
                System.out.println("DNI del lector: " + prestamo.getLector().getDni());
                System.out.println("ID de la copia: " + prestamo.getCopia().getIdCopia());
                System.out.println("Nombre del Libro: " + prestamo.getCopia().getLibro().getNombre());
                int retraso = (int) ((ahora.getTime()-prestamo.getFechaInicio().getTime())/86400000);

                if ((int) ((ahora.getTime()-prestamo.getFechaInicio().getTime())/86400000) < 0 && prestamo.getLector().getDiasMultas() != retraso * -2){

                    System.out.println("Este lector debería ser multado (tiene " + retraso * -1 + " días de retraso)");
                    System.out.println("Vaya al menú para imponer todas las multas");

                }
                System.out.println("\n");
            }
        }
    }

    public void dosLibrosConMayorMulta(){
        ArrayList<Lector> lectoresConMasMultas = new ArrayList<Lector>();
        System.out.println("- DOS LIBROS CON MAS MULTAS -");

        for (Prestamo prestamo : prestamos) {
            lectoresConMasMultas.add(prestamo.getLector());
        }


        Lector primerLectorConMasMultas = null;
        Lector segundoLectorConMasMultas = null;
        int mayor1 = 0;
        int mayor2 = 0;

        for (Lector lector1 : lectoresConMasMultas) {
            mayor1 = lector1.getDiasMultas();
            primerLectorConMasMultas = lector1;
            for (Lector lector2 : lectoresConMasMultas) {
                if(lector2.getDiasMultas() > mayor1){
                    mayor1 = lector2.getDiasMultas();
                    primerLectorConMasMultas = lector2;
                }
            }
        }

        lectoresConMasMultas.remove(primerLectorConMasMultas);

        for (Lector lector1 : lectoresConMasMultas) {

            segundoLectorConMasMultas = lector1;
            mayor2 = segundoLectorConMasMultas.getDiasMultas();

            for (Lector lector2 : lectoresConMasMultas) {

                if(lector2.getDiasMultas() > mayor2){
                    segundoLectorConMasMultas = lector2;
                    mayor2 = lector2.getDiasMultas();
                }
            }
        }

        int i = 0;

        for (Prestamo prestamo : prestamos) {

            if(prestamo.getLector() == primerLectorConMasMultas || prestamo.getLector() == segundoLectorConMasMultas){

                Copia copia = prestamo.getCopia();

                for (Copia copia1 : copias) {

                    if(copia1 == copia){
                        i+=1;
                        Libro libro = copia1.getLibro();
                        System.out.println("\nLibro " + i + ": ");
                        System.out.println("Nombre: "+ libro.getNombre());
                    }
                }
            }
        }
    }



    public void crearPrestamo() throws ParseException {

        System.out.println("\n- CREAR PRESTAMO -\n");
        System.out.println("Ingrese fecha de inicio del prestamo");
        String fecha = stringInput.next();
        System.out.println("\nIngrese DNI del lector: ");
        int dni = intInput.nextInt();
        System.out.println("\nIngrese ID de la copia");
        int idCopia = intInput.nextInt();


        Lector lectorPrestamo = null;
        Copia copiaPrestamo = null;

        for (Lector lector : lectores) {
            if(lector.getDni() == dni){
                lectorPrestamo = lector;
                break;
            }
        }

        for (Copia copia : copias) {
            if(copia.getIdCopia() == idCopia){
                copiaPrestamo = copia;
                break;
            }
        }

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formato = new SimpleDateFormat(pattern);
        Date fechaInicio = formato.parse(fecha);

        if(lectorPrestamo != null && copiaPrestamo != null){
            Prestamo prestamo = new Prestamo(fechaInicio, copiaPrestamo, lectorPrestamo, "activo");
            prestamos.add(prestamo);
            System.out.println("Prestamo creado con exito!");
        }
        else{
            System.out.println("Datos ingresados incorrectamente! idCopia o DNI");
        }


    }




    public void cerrarPrestamo(){

        System.out.println("Ingrese ID de la Copia del libro que esta en el prestamo: ");
        int idCopia = intInput.nextInt();
        boolean borrado = false;

        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCopia().getIdCopia() == idCopia){
                borrado = true;
                prestamo.setEstado("Devuelto");
                System.out.println("Prestamo cerrado con exito!");
                prestamos.remove(prestamo);
            }
        }

        if(!borrado){
            System.out.println("El ID de copia ingresado no existe!");
        }

    }

}
