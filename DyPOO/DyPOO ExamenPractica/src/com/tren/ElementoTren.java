package com.tren;

public class ElementoTren {
    private String tipo;
    private double longitud;
    private double peso;

    public ElementoTren() {
        this.tipo = "";
        this.longitud = 0;
        this.peso = 0;
    }

    public ElementoTren(String tipo, double longitud, double peso) {
        this.tipo = tipo;
        this.longitud = longitud;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "|" + getTipo() + "|¬";
    }
}
