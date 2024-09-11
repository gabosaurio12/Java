package com.dypoo5;

public class Camioneta {
    private int year;
    private String marca;
    private String placa;

    public Camioneta(String marca, String placa, int year) {
        this.marca = marca;
        this.placa = placa;
        this.year = year;
    }

    public String toString() {
        String cadena = marca + ":" + placa + ":" + year + ":";
        return cadena;
    }
}
