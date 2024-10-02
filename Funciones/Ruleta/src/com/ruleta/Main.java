package com.ruleta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<String> opciones = new ArrayList<>();
        boolean band = true;

        System.out.println("Ingresa '.' cuando quieras dejar de leer opciones");

        String lec = read.nextLine();
        while (!lec.equals(".")) {
            opciones.add(lec);
            lec = read.nextLine();
        }

        while (band) {
            RandomR random = new RandomR(opciones);
            random.mostrarResultado();

            System.out.println("Repetir con las mismas opciones? ");
            String c = read.nextLine();
            if (c.equals("s")) {
                System.out.println();
            } else if (c.equals("n")){
                opciones.clear();
                lec = read.nextLine();
                while (!lec.equals(".")) {
                    opciones.add(lec);
                    lec = read.nextLine();
                }
            } else {
                band = false;
            }
        }
    }
}
