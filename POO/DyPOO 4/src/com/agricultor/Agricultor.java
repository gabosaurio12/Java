package com.agricultor;

public class Agricultor {

    public static void main(String[] args) {
        Terreno terreno = new Terreno(100, 100);
        System.out.println("Area efectiva " + terreno.calcularAreaEfectiva(5000));
    }
}
