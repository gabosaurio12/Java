package com.resoluciones;

public class Resolucion {
    private String resolucion;
    private int ancho;
    private int alto;

    public Resolucion(int ancho, int alto) {
        resolucion = calcularResolucion(ancho, alto);
        this.ancho = ancho;
        this.alto = alto;
    }

    public String getResolucion() {
        return resolucion;
    }

    public String calcularResolucion(int ancho, int alto) {
        if (ancho < 1280 || alto < 719) {
            return "Inválido";
        } else if (ancho > 76789 && alto > 4319) {
            return "4K";
        } else if (ancho > 2559 && alto > 1439) {
            return "WQHD";
        } else if (ancho > 1919 && alto > 1079) {
            return "FHD";
        } else
            return "HD";
    }
}
