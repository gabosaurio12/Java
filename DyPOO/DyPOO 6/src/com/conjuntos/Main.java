package com.conjuntos;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("a");
        conjunto.add("b");
        conjunto.add("c");
        conjunto.add("d");
        conjunto.add("a");
        conjunto.add("b");

        System.out.println("Se encuentra a, respuesta " + conjunto.contains("a"));
        for (String datos : conjunto) {
            System.out.println(datos);
        }

        System.out.println("For-Each 1");
        for (String dato : conjunto) {
            System.out.println(dato);
        }

        System.out.println("\nIterador");
        Iterator<String> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Elemento: " + element);
        }

        System.out.println("\nFor-Each 2");
        conjunto.forEach(letra -> System.out.println("Elemento " + letra.toUpperCase()));
    }
}
