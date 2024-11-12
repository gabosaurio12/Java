package org.persona;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Gabo", new Date(11, 2, 2005));
        System.out.println("Nombre " + p.getName());
        System.out.print("Cumple ");
        p.printDate();
        System.out.println("Edad " + p.getAge());
    }
}
