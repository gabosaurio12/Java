package com.solucion;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static final String REGEX_MATRICULA = "^\\d{5}$";

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<Alumno>();
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opción no válida...");
            }
        } while (opcion != 9);
    }
}
