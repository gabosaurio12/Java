package com.Main;

import com.ArregloDecimal.ArregloDecimal;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ArregloDecimal numeros = new ArregloDecimal();
        numeros.leerNumeros();
        System.out.println("Numero Mayor: " + numeros.numeroMayor());
        System.out.println("Numero Menor: " + numeros.numeroMenor());
        System.out.println("Promedio: " + numeros.calcularPromedio());
    }
}
