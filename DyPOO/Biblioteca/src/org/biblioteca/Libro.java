package org.biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class Libro {

    private String titulo;
    private String autor;
    private String ISBN;
    private String genero;
    private String categoria;
    private int anoDePublicacion;
    private int copiasDisponibles;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;

    public Libro() {
        
        Scanner scn = new Scanner(System.in);
        String titulo, autor, ISBN, genero, categoria;
        int anoDePublicacion, copiasDisponibles;

        System.out.print("Titulo: ");
        titulo = scn.nextLine();

        System.out.print("Autor: ");
        autor = scn.nextLine();

        System.out.print("ISBN: ");
        ISBN = scn.nextLine();

        System.out.print("Genero: ");
        genero = scn.nextLine();

        System.out.print("Categoria: ");
        categoria = scn.nextLine();

        System.out.print("Año de publicación: ");
        anoDePublicacion = scn.nextInt();

        System.out.print("Copias Disponibles: ");
        copiasDisponibles = scn.nextInt();

        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.genero = genero;
        this.categoria = categoria;
        this.anoDePublicacion = anoDePublicacion;
        this.copiasDisponibles = copiasDisponibles;
    }

    // INICIO Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnoDePublicacion() {
        return anoDePublicacion;
    }

    public void setAnoDePublicacion(int anoDePublicacion) {
        this.anoDePublicacion = anoDePublicacion;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    // FIN SETTERS Y GETTERS

    public void configurarFechas() {

        fechaPrestamo = LocalDate.now();
        fechaEntrega = LocalDate.now().plusDays(5);
    }

    public void imprimirDatosLibro() {
        System.out.println("ISBN: " + getISBN());
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Género: " + getGenero());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Año de publicación: " + getAnoDePublicacion());
        System.out.println("Copias Disponibles: " + getCopiasDisponibles());
    }
}