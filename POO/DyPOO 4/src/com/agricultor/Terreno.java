package com.agricultor;

import com.dypoo4.Lienzo;

public class Terreno extends Lienzo {
    private int ancho;
    private int alto;

    public Terreno(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        paintTerreno();
    }

    private void paintTerreno() {
        for (int x = 0; x < ancho; x++) {
            setPen(x, (int) bordeSuperior(x), '*');
            setPen(x, (int) bordeInferior(x), '*');
        }
        paint();
    }

    public Double desperdicio(double x) {
        return bordeSuperior(x) - bordeInferior(x);
    }

    public double bordeSuperior(double x) {
        return 70 + 8 * Math.sin(x / 35) * Math.sin(x / 15);
    }

    public double bordeInferior(double x) {
        return 50 + 5 * Math.cos(x / 10) * Math.sin(x / 15);
    }

    public double calcularAreaEfectiva(int precision) {
        Reimman areaEfectiva = new Reimman();
        return (ancho * alto) - areaEfectiva.calcularArea(0, ancho, precision, this);

    }
}
