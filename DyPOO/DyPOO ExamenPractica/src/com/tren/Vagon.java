package com.tren;

public class Vagon extends ElementoTren {

    public Vagon(double carga) {
        super("Vagon", 18.28, (25400 + carga));
    }
}
