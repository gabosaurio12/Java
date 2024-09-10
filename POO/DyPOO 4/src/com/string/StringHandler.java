package com.string;

import java.util.ArrayList;

public class StringHandler {

    public static void main(String[] args) {
        String libro = "Harry Potter y el Caliz de Fuego, 321654987, J. Rowling, 2000";
        String[] datos = libro.split(",");

        System.out.println("Numero de datos: " + datos.length);
        Libro l1 = new Libro(datos[0], datos[2], datos[1], Integer.valueOf(datos[3].trim()));

        ArrayList<String> librosStr = new ArrayList<>();
        librosStr.add("Harry Potter y la piedra filosofal, 321654987, J. Rowling, 1997");
        librosStr.add("Harry Potter y la camara secreta, 321654987, J. Rowling, 1998");
        librosStr.add("Harry Potter y el prisionero de Azkaban, 321654987, J. Rowling, 1999");
        librosStr.add("Harry Potter y el Caliz de Fuego, 321654987, J. Rowling, 2000");

        ArrayList<Libro> libros = new ArrayList<>();

        for (String l : librosStr) {
            String[] data = l.split(",");
            libros.add(
            new Libro(data[0].trim().toUpperCase(),
                    data[2].trim().toUpperCase(),
                    data[1].trim().toUpperCase(),
                    Integer.valueOf(data[3].trim())));
        }

        System.out.println("Total libros" + libros.size());
        System.out.println(libros.get(0).toString());
    }
}
