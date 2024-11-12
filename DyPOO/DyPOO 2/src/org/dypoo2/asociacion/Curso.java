package org.dypoo2.asociacion;

public class Curso {
    private String nombre;
    private Profesor profesor;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void mostrarProfesor() {
        System.out.println("Profesor: " + profesor.getNombre() + " da " + nombre);
    }
}
