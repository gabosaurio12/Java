package com.ejercicio_iv_b;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Classroom {
    private Set<String> studentIds;

    public Classroom() {
        studentIds = new HashSet<>();
    }

    public void addStudentId(String id) {
        if (studentIds.add(id)) {
            System.out.println("Estudiante ID " + id + " agregado.");
        } else {
            System.out.println("Estudiante ID " + id + " ya existe.");
        }
    }

    public void displayStudentIds() {
        Iterator<String> it = studentIds.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println("ID: " + element);
        }
    }
}
