package com.alumno;

import java.util.HashSet;

public class Alumno {
    private String nombre;
    private HashSet<String> materias;

    public Alumno(String nombre) {
        this.nombre = nombre;
        materias = new HashSet<>();
    }

    public String getNombre() { return nombre; }

    public HashSet<String> getMaterias() {
        return materias;
    }

    public void inscribirMateria(String materia) {
        materias.add(materia);
    }

    public void inscribirMateria(String[] materia) {
        for (String mat : materia) {
            materias.add(mat);
        }
    }

    public void bajaMateria(String materia) {
        materias.remove(materia);
    }

    public void mostrarMaterias() {
        for (String materia : materias) {
            System.out.println(materias);
        }
    }
}
