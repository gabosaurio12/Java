package com.estaticas;

public class Estaticas {
    
    /*public static int[] matToArr(int[][] matrix, int size) {
    	int k = 0;
    	int[] array = new int[size * size];

    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			array[k] = matrix[i][j];
    			k++;
    		}
    	}

    	return array;
    }

    public static int[] arrToMat(int[] array) {
    	int k = 0;
    	int size = Math.sqrt(array.length);
    	int[][] matrix = new int[size][size];

    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			matrix[i][j] = array[k];
    			k++;
    		}
    	}

    	return matrix;
    }
*/
    public static void printArray(int[] array) {
    	System.out.print("Array: ");
    	for (int i = 0; i < array.length; i++) {
    		System.out.print(array[i] + " ");
    	}
    }

    public static void printMatrix(int[][] matrix, int size) {
    	System.out.println("Matrix: ");
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			System.out.print(matrix[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
}
