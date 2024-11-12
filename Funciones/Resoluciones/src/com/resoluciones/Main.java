package com.resoluciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ancho, alto;
        System.out.println("Ancho ");
        ancho = scn.nextInt();
        System.out.println("Ancho ");
        alto = scn.nextInt();

        Resolucion reso = new Resolucion(ancho, alto);
        System.out.println(reso.getResolucion());
    }
}
