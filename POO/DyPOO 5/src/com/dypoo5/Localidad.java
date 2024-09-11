package com.dypoo5;

public class Localidad {
    private String cp;
    private String estado;
    private String municipio;

    public Localidad(String cp, String estado, String municipio) {
        this.cp = cp;
        this.municipio = municipio;
        this.estado = estado;
    }

    public String toString() {
        String cadena = cp + ":" + municipio + ":" + estado;
        return cadena;
    }
}
