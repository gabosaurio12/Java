package com.dypoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orden {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("S1901","Mario Lopez",0));
        alumnos.add(new Alumno("S2002","Sergio Cuellar",0));
        alumnos.add(new Alumno("S1803","Josh Nicols",0));
        alumnos.add(new Alumno("S2101","Catalina Gonzales",0));
        alumnos.add(new Alumno("S2209","Ariadna Gallegos",0));
        alumnos.add(new Alumno("S1902","Marcelo Trello",0));
        alumnos.add(new Alumno("S2104","Paolo Maldonado",0));
        alumnos.add(new Alumno("S2001","Dalton Vega",0));

        List<String> frutas = new ArrayList<>();
        frutas.add("Sandia");
        frutas.add("fresa");
        frutas.add("manzana");

        System.out.println("LISTA DE FRUTAS");
        Collections.sort(frutas);

        for(String f : frutas){
            System.out.println(f);
        }

        Collections.sort(alumnos);
        System.out.println("LISTA DE ALUMNOS");
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
}
