package com.tren;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testPesosAleatorios() { // Hace un tren con 5 vagones con cargas aleatorias
        Tren tren = new Tren();
        int[] pesoTrenPrueba = new int[5];
        for (int i = 0; i < 5; i++) {
            int pesoVagon = numeroAleatorio();
            tren.agregarVagones(new Vagon(pesoVagon));
            pesoTrenPrueba[i] = pesoVagon + 25400;
        }

        System.out.println("Pesos generados");
        int pesoVagones = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(pesoTrenPrueba[i] + " ");
            pesoVagones += pesoTrenPrueba[i];
        }

        int pesoTotal = pesoVagones + (tren.getLocomotoras() * 92600);

        assertEquals(pesoTotal,tren.getPeso(), "Si pesoTotal y pesoTren son iguales la prueba fue exitosa");
        assertEquals(5, tren.getVagones(), "Si el tren tiene 5 vagones la prueba fue exitosa");

        System.out.println();
        System.out.println("Peso de vagones: " + pesoVagones);
        System.out.println("Peso total generado: " + pesoTotal);
        tren.getInfo();
    }

    public int numeroAleatorio() {
        Random aleatorio = new Random();
        int max = 250000, min = 20000;
        return aleatorio.nextInt(max - min + 1) + min;
    }
}
