package com.dypoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparaObjetos {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("S190202020","Pedro Perez", 20);
        Alumno a2 = new Alumno("S190204230","Juan Perez", 20);
        Alumno a3 = new Alumno("S190203242","Miguel Perez", 20);
        Alumno a4 = new Alumno("S114134144","Linda Perez", 20);
        Alumno a5 = new Alumno("S241525213","Liz Perez", 20);
        Alumno a6 = new Alumno("S727281888","Mike Perez", 20);

        List<Alumno> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        lista.add(a6);

        for (Alumno alm : lista) {
            System.out.println(alm);
        }

        Collections.sort(lista);

        System.out.println();
        
        for (Alumno alm : lista) {
            System.out.println(alm);
        }

		System.out.println();

        if(a1.equals(a2)){
            System.out.println("a1 y a2 son el mismo alumno");
        }else{
            System.out.println("a1 y a2 difieren en nombre y/o matrícula");
        }
    }

}
