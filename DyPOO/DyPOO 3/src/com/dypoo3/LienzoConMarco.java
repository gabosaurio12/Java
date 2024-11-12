package com.dypoo3;

public class LienzoConMarco extends Lienzo {

    public LienzoConMarco(int size) {
        size += 2;
        this.size = size;
        this.lienzo = new char[size][size];

        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size-1) {
                for (int j = 0; j < size; j++) {
                    lienzo[i][j] = '°';
                }
            } else {
                lienzo[i][0] = '°';
                lienzo[i][size-1] = '°';
            }
        }
        for (int i = 1; i < size-1; i++) {
            for (int j = 1; j < size-1; j++) {
                lienzo[i][j] = ' ';
            }
        }
    }

    @Override
    public void setPen(int x, int y, char c) {
        super.setPen(x + 1, y + 1, c);
    }

    @Override
    public void dibujar() {
        super.dibujar();
    }
}
