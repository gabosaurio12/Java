package com.tren;

public class Locomotora extends ElementoTren {
    private double capacidadCarga;

    public Locomotora() {
        super("Locomotora", 20.17, 92600); // super llama al constructor de la super clase
        this.capacidadCarga = 200000;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}
