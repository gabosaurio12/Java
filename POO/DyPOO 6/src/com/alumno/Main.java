package com.alumno;

public class Main {

    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        Alumno a1 = new Alumno("José");
        a1.inscribirMateria("Matemáticas");
        Alumno a2 = new Alumno("María");
        a2.inscribirMateria(new String[] { "Fisica", "Matematicas", "Español" });
        Alumno a3 = new Alumno("Joanna");
        escuela.agregarEstudiante(a1);
        escuela.agregarEstudiante(a2);
        escuela.agregarEstudiante(a3);
        escuela.mostrarEstudiantes();
    }
}
