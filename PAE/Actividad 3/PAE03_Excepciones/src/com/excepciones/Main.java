package com.excepciones;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciamos con el método de división entre 0");
        LlamarExcepcionAritmetica division = new LlamarExcepcionAritmetica();
        division.divisionEntreCero(5);
    }
}
