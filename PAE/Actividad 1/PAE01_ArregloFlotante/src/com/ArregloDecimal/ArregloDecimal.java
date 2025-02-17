package com.ArregloDecimal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArregloDecimal {
    private double[] decimales;

    public ArregloDecimal() {
        decimales = new double[10];
    }

    public void leerNumeros() {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un número ");
            decimales[i] = scn.nextDouble();
        }
    }

    public double numeroMayor() {
        return Arrays.stream(decimales).max().orElse(Double.NaN);
    }

    public double numeroMenor() {
        return Arrays.stream(decimales).min().orElse(Double.NaN);
    }

    public double calcularPromedio() {
        return Arrays.stream(decimales).average().orElse(Double.NaN);
    }
}
