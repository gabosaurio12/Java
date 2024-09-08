package com.dypoo3;

public class Main {

    public static void main(String[] args) {
        Lienzo lienzo = new Lienzo(10);
        lienzo.setPen(5, 5, '*');
        lienzo.dibujar();

        LienzoConMarco lienzoMarco = new LienzoConMarco(10);
        lienzoMarco.setPen(5, 5, '*');

        lienzoMarco.dibujar();
    }
}
