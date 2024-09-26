package com.dypoo8;

import static com.dypoo8.Aleatorio.getPermutacion;
import static com.dypoo8.Aleatorio.rnd; // random

public class BusquedaLocal {

    Tablero tablero;


    /**
     * @return Regresa una configuración del problema con cero ataques
     */

    public BusquedaLocal(Tablero tablero) {
        this.tablero = tablero;
    }

    public Solucion Algoritmo() {
        Solucion s = new Solucion(tablero.size);
        tablero.x = getPermutacion(tablero.size);
        while (tablero.contarAtaques(tablero.x) != 0) {
            tablero.x = getPermutacion(tablero.size);
            tablero.evals++;
        }

        s.ataques = tablero.contarAtaques(tablero.x);
        s.permutacion = tablero.x;

        return s;
    }

    /**
     * este método genera una perturbación a partir de una solución
     */
    private Solucion Tweak(Solucion s) {
        Solucion s1 = new Solucion(tablero.size);
        s1.permutacion = s.permutacion.clone();

        /*Genero dos puntos aleatorios del 0 al (boardSize-1)*/
        int p1 = rnd(0, tablero.size - 1);
        int p2 = rnd(0, tablero.size - 1);
        /*Con este ciclo me aseguro que p1 y p2 sean distintos*/
        while (p1 == p2) {
            p1 = rnd(0, tablero.size - 1);
        }

        /*Ejecuto mi intercambio de valores de la permutación de la solución s*/
        int temp = s1.permutacion[p1];
        s1.permutacion[p1] = s1.permutacion[p2];
        s1.permutacion[p2] = temp;

        s1.ataques = tablero.contarAtaques(s1.permutacion);

        return s1;
    }
}
