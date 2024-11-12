package org.dypoo2.agregacion;

public class Vehiculo {
    private Motor motor;

    public Vehiculo(Motor motor) {
        this.motor = motor;
    }

    public void mostrarMotor() {
        System.out.println("Motor: " + motor.getTipo());
    }
}
