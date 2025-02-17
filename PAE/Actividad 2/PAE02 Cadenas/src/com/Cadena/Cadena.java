package com.Cadena;

import java.util.Scanner;

public class Cadena {
    private final String oracion;

    public Cadena() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce una oración");
        oracion = scn.nextLine().trim();
        if (oracion.isEmpty()) {
            System.out.println("Oración inválida");
        } else {
            System.out.printf("Longitud: %s%n", calcularLongitud());
            System.out.printf("Palabras: %s%n", calcularPalabras());
            System.out.printf("Vocales: %s%n", calcularVocales());
            System.out.printf("Frase invertida: %s%n", invertirOracion());
        }
    }

    public int calcularLongitud() {
       return oracion.length();
    }

    public int calcularPalabras() {
        String[] palabras = oracion.split(" ");
        return palabras.length;
    }

    public int calcularVocales() {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};
        char[] oracionMinus = oracion.toLowerCase().toCharArray();
        int cont = 0;
        for (char i : oracionMinus) {
            for (char k : vocales) {
                if (i == k)
                    cont++;
            }
        }

        return cont;
    }

    public String invertirOracion() {
        String[] palabras = oracion.split(" ");
        StringBuilder oracionInvertida = new StringBuilder();
        for (int i = palabras.length - 1; i > -1; i--) {
            oracionInvertida.append(palabras[i]);
            oracionInvertida.append(" ");
        }

        return oracionInvertida.toString();
    }

    /* Solución Profe
    public Integer contarVocales() {
        Integer vocales = 0;
        if (oracion != null) {
            for (char c : oracion.toLowerCase().toCharArray()) {
                String letra = ""+c;
                if (letra.matches("[aeiouáéíóú]")) {
                    vocales++;
                }
            }
        }

        return 0;
    }*/
}
