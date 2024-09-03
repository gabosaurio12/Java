package org.dypoo2.asociacion;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Abraham");
        Curso curso1 = new Curso("Matemáticas");
        Curso curso2 = new Curso("Física");

        curso1.asignarProfesor(profesor);
        curso1.mostrarProfesor();

        curso2.asignarProfesor(new Profesor("Cristy"));
        curso2.mostrarProfesor();
    }
}
