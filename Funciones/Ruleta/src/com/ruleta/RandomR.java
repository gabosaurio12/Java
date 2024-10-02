package com.ruleta;

import java.util.ArrayList;
import java.util.Random;

public class RandomR {
    private String resultado;

    public RandomR(ArrayList<String> lista) {
        resultado = getResultado(lista);
    }

    public String getResultado(ArrayList<String> lista) {
        Random rnd = new Random();
        return lista.get(rnd.nextInt(lista.size()));
    }

    public void mostrarResultado() {
        System.out.println(resultado);
    }


}
