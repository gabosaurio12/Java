package org.sesion5;

public class Dog extends Animal {

    @Override // Sobre escribir, se usa para el polimorfismo
    public void makeSound() {
        System.out.println("Perro Ladrando");
    }
}
