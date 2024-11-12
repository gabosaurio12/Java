package org.dypoo2.agregacion;

public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor("V8");
        Vehiculo coche = new Vehiculo(motor);
        Vehiculo moto = new Vehiculo(new Motor("T"));

        coche.mostrarMotor();
        moto.mostrarMotor();
    }
}
