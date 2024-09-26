package com.mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("0322", 5);
        mapa.put("L325", 8);
        mapa.put("K232", 1);

        for (String key : mapa.keySet()) {
            System.out.println("Clave " + key);
        }
        for (Integer dato : mapa.values()) {
            System.out.println("Dato " + dato);
        }

        Iterator<Map.Entry<String, Integer>> iterator = mapa.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Clave " + entry.getKey() + " Dato " + entry.getValue());
        }

        mapa.forEach((key, value) ->
            System.out.println("Clave " + key + " , Valor: " + value)
        );

    }
}
