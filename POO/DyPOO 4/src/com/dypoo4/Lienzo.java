package com.dypoo4;

public class Lienzo {
    private int size;
    private char[][] lienzo;

    public Lienzo() {
        size = 100;
        lienzo = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                lienzo[i][k] = ' ';
            }
        }
    }

    public void setPen(int x, int y, char c) {
        if (x > 0 || y < size) {
            int pos = size -1;
            lienzo[y][x] = c;
        }
    }

    public void paint() {
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                System.out.print(lienzo[i][k]);
            }
            System.out.println();
        }
    }
}
