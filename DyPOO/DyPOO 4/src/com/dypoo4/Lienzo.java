package com.dypoo4;

public class Lienzo {
    private int lado; // lado es tamaño, pero no me gusta poner tamano, se lee raro
    private char lienzo[][];

    public Lienzo() {
        lado = 100;
        lienzo = new char[lado][lado];

        for (int i = 0; i < lado; i++) {
            for (int k = 0; k < lado; k++) {
                lienzo[i][k] = ' ';
            }
        }
    }

    public void setPen(int x, int y, char c) {
        if (x > 0 || y < lado) {
            lienzo[y][x] = c;
        }
    }

    public void print() {
        for (int i = 0; i < lado; i++) {
            for (int k = 0; k < lado; k++) {
                System.out.print(lienzo[i][k]);
            }
            System.out.println();
        }
    }
}
