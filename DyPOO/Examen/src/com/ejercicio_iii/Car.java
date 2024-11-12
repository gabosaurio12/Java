package com.ejercicio_iii;

public class Car {
    private Engine engine;

    public Car(String engineType) {
        this.engine = new Engine(engineType); // composición
    }

    public void startCar() {
        System.out.println("Encendiendo carro ...");
        engine.start();
    }
}
