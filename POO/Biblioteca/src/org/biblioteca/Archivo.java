package org.biblioteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

    public void registrarPrestamo(Libro libroPrestado) {

        try {
            FileWriter escribirArch = new FileWriter("prestamos.txt");
            escribirArch.write(libroPrestado.getISBN() + "\t" + libroPrestado.getTitulo() + libroPrestado.getFechaPrestamo() +  "\t" + libroPrestado.getFechaEntrega() + "\n");
            escribirArch.close();

            FileWriter registro = new FileWriter("registros.txt");
            registro.write("P " + libroPrestado.getISBN() + "\t" + libroPrestado.getTitulo() + libroPrestado.getFechaPrestamo() +  "\t" + libroPrestado.getFechaEntrega() + "\n");
            registro.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }

    public void registrarDevolucion(Libro libroPrestado) {

        try {
            FileWriter escribirArch = new FileWriter("devoluciones.txt");
            escribirArch.write(libroPrestado.getISBN() + "\t" + libroPrestado.getTitulo() + libroPrestado.getFechaPrestamo() +  "\t" + libroPrestado.getFechaEntrega() + "\n");
            escribirArch.close();

            FileWriter registro = new FileWriter("registros.txt");
            registro.write("D " + libroPrestado.getISBN() + "\t" + libroPrestado.getTitulo() + libroPrestado.getFechaPrestamo() +  "\t" + libroPrestado.getFechaEntrega() + "\n");
            registro.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }

    public void historialPrestamos(String archivo) {

        try {
            FileReader leerArch = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(leerArch);

            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }

            buffer.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
