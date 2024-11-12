package package com.dypoo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String matricula;
    private String nombre;
    private int edad;

    public Alumno(String matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(matricula, alumno.matricula) && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nombre);
    }

/*
    @Override
    public int compareTo(Alumno alumno) {
        //return Integer.compare(this.edad, alumnos.edad);
        return this.nombre.compareTo(alumno.nombre);
    }
*/


    @Override
    public int compareTo(Alumno alumno) {
        int resultadoMatricula = this.matricula.compareTo(alumno.matricula);
        if (resultadoMatricula == 0) {
            return this.nombre.compareTo(alumno.nombre);
        }
        return resultadoMatricula;
    }


    @Override
    public String toString() {
        return this.nombre+" - "+this.matricula;
    }


}
