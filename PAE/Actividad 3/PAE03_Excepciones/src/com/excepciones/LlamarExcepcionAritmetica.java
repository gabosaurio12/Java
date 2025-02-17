package com.excepciones;

public class LlamarExcepcionAritmetica {

    public double divisionEntreCero(double numero) {
        double numero2 = 0;
        try {
            numero2 = numero / 0;
        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir entre 0");
        }

        return numero2;
    }
}
