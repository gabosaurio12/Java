package com.agricultor;

public class Reimman {

    public double calcularArea(double xI, double xF, int numeroPasos, Terreno terreno) {
        double resultado = 0.0;
        double incremento = (xF - xI) / numeroPasos;
        double semiIncremento = incremento / 2;
        double x = xI;

        // calcula suma de los rectángulos
        for (int i = 0; i < numeroPasos; i++) {
            resultado += incremento * terreno.desperdicio(x + semiIncremento);
        }

        return resultado;
    }
}
