package com.alumno;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Escuela {
    private Map<String, HashSet<String>> estudiantes;

    public Escuela() {
        estudiantes = new HashMap<>();
    }

    public void agregarEstudiante(Alumno estudiante) {
        estudiantes.put(estudiante.getNombre(), estudiante.getMaterias());
    }

    public void mostrarEstudiantes() {
        for (String key : estudiantes.keySet()) {
            System.out.print(key + " -> Materias: ");
            if (!estudiantes.get(key).isEmpty()) {
                System.out.print("[");
                for (String materias : estudiantes.get(key)) {
                    System.out.print(materias + ",");
                }
                System.out.println("]");
            } else {
                System.out.println();
            }
        }
    }
}
