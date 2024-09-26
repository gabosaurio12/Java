package com.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("a");
        lista.add("b");

        System.out.println("For-Each 1");
        for (String dato : lista) {
            System.out.println(dato);
        }

        System.out.println("\nIterador");
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Elemento: " + element);
        }

        System.out.println("\nFor-Each 2");
        lista.forEach(letra -> System.out.println("Elemento " + letra.toUpperCase()));
                
    }
}
