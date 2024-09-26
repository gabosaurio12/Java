package com.dypoo8;

import java.util.Arrays;

public class Tablero {
    int size;
    int evals = 0;
    Solucion s;
    int[] x;

    public Tablero(int size) {
        this.size = size;
        init();
    }

    private void init() {
        s = new Solucion(size);
        s.permutacion = Aleatorio.getPermutacion(size);
        s.ataques = contarAtaques(s.permutacion);
        evals++;
        x = Arrays.copyOf(s.permutacion, size);
    }

    public int[] convArray(int[][] matriz, int n) {
        int [] array = new int[n * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[k] = matriz[i][j];
                k++;
            }
        }

        return array;
    }

    public int contarAtaques(int[] permutacion) {
        int ataques = 0;
        /**
         * Se obtiene la matriz con el tablero
         * el tablero contiene 1 donde hay reina y 0 en caso
         * contrario
         */
        int[][] board = getTablero(permutacion);

        int[] boardArr = convArray(board, size);

        for (int i = 0; i < size * size; i++) {
            if (boardArr[i] == 1) {
                if (i + size - 1 < size * size) {
                    for (int k = i + size - 1; k < size; k += size - 1) {
                        if (boardArr[k] == 1)
                            ataques++;
                    }
                }
                if (i - size + 1 > 0) {
                    for (int k = i - size + 1; k > 0; k -= size + 1) {
                        if (boardArr[k] == 1)
                            ataques++;
                    }
                }
            }
        }

        return ataques;
    }

    private int[][] getTablero(int[] permutacion) {
        int boardSize = permutacion.length;
        int[][] board = new int[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = (permutacion[i] == j) ? 1 : 0;
            }
        }
        return board;
    }
}
