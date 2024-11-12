package com.ejercicio_iii;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void start() {
        System.out.println("motor " + type + " encendido");
    }
}
