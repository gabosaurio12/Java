package org.sesion5;

public class Main {

    public static void main(String[] args) {
        imprimeAccion(new Dog());
        imprimeAccion(new Cat());
        System.out.println();

        imprimeFigura(new Circle());
        imprimeFigura(new Square());
        System.out.println();

        Person p = new Person();
        p.setAge(15);
        p.setName("Juan");
        System.out.println(p.getName() + " " + p.getAge());

        Person p2 = new Person("Pepe", 10);
        System.out.println(p2.getName() + " " + p2.getAge());

    }

    public static void imprimeAccion(Animal animal) {
        animal.makeSound();
    }

    public static void imprimeFigura(Shape figura) {
        figura.draw();
    }
}
