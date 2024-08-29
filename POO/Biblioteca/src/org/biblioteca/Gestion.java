package org.biblioteca;

import java.util.Map;
import java.util.Scanner;

public class Gestion {

    // INICIO Funciones de Miembros

    public void registrarMiembro(Map<String, Miembro> miembros) {

        Scanner scn = new Scanner(System.in);
        Miembro miembroRegisrar = new Miembro(miembros.size());
        String id = miembroRegisrar.getId();
        miembros.put(id, miembroRegisrar);
        System.out.print("\033[H\033[2J");
        System.out.println("Miembro registrado con éxito");
        System.out.println("ID: " + miembroRegisrar.getId());
        scn.nextLine();
    }

    public void cancelarMembresia(Map<String, Miembro> miembros, String id) {

        Scanner scn = new Scanner(System.in);
        if (miembros.get(id) != null) {
            miembros.remove(id);
            System.out.println("Membresía cancelada");
        } else {
            System.out.println("No se encontró el usuario");
        }
        scn.nextLine();
    }

    public void mostrarPrestamos(Map<String, Miembro> miembros, String id) {

        Scanner scn = new Scanner(System.in);
        Miembro miembroBuscado = miembros.get(id);
        for (int i = 0; i < miembroBuscado.getPrestamos(); i++) {
            miembroBuscado.imprimirPrestamo(i);
            System.out.println("Multa: " + miembroBuscado.getMulta());
        }
        scn.nextLine();
    }

    public void mostrarMiembros(Map<String, Miembro> miembros) {

        Scanner scn = new Scanner(System.in);
        for (Map.Entry<String, Miembro> me: miembros.entrySet()) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue().getNombre());
            System.out.println();
        }
        scn.nextLine();
    }

    // FIN Funciones de Miembros

    // INICIO Funcionse para actualizar información

    public void actualizarInformacionLibro(String isbn, Map<String, Libro> libros) {

        Libro libroBuscado = libros.get(isbn);
        Scanner scn = new Scanner(System.in);

        if (libroBuscado != null) {

            System.out.println("Qué editarás: ");
            System.out.println("1. Título");
            System.out.println("2. Autor");
            System.out.println("3. Género");
            System.out.println("4. Categoría");
            System.out.println("5. Año de publicación");
            System.out.println("6. Copias Disponibles");
            int opc = scn.nextInt();
            scn.nextLine();
            String nuevoDato;
            int nuevoEntero;
            switch (opc) {
                case 1:
                    nuevoDato = scn.nextLine();
                    libroBuscado.setTitulo(nuevoDato);
                    break;
                case 2:
                    nuevoDato = scn.nextLine();
                    libroBuscado.setAutor(nuevoDato);
                    break;
                case 3:
                    nuevoDato = scn.nextLine();
                    libroBuscado.setGenero(nuevoDato);
                    break;
                case 4:
                    nuevoDato = scn.nextLine();
                    libroBuscado.setCategoria(nuevoDato);
                    break;
                case 5:
                    nuevoEntero = scn.nextInt();
                    libroBuscado.setAnoDePublicacion(nuevoEntero);
                    break;
                case 6:
                    nuevoEntero = scn.nextInt();
                    libroBuscado.setCopiasDisponibles(nuevoEntero);
                    break;
            }
            System.out.println("Información actualizada");
            libroBuscado.imprimirDatosLibro();
        } else {
            System.out.println("No se encontró el libro");
        }
        scn.nextLine();
    }

    public void actualizarInfoMiembro(String id, Map<String, Miembro> miembros) {

        Scanner scn = new Scanner(System.in);
        Miembro miembroBuscado = miembros.get(id);
        if (miembroBuscado != null) {
            System.out.println("Qué editarás: ");
            System.out.println("1. Nombre");
            System.out.println("2. Dirección");
            System.out.println("3. Tipo de Membresía");
            int opc = scn.nextInt();
            scn.nextLine();
            String nuevoDato;
            switch (opc) {
                case 1:
                    System.out.print("Nombre: ");
                    nuevoDato = scn.nextLine();
                    miembroBuscado.setNombre(nuevoDato);
                    break;
                case 2:
                    System.out.print("Dirección: ");
                    nuevoDato = scn.nextLine();
                    miembroBuscado.setDireccion(nuevoDato);
                    break;
                case 3:
                    System.out.println("1. Standard");
                    System.out.println("2. Premium");
                    System.out.println("1. Ultra");
                    opc = scn.nextInt();
                    switch (opc) {
                        case 1:
                            miembroBuscado.setTipoMembresia("Standard");
                            break;
                        case 2:
                            miembroBuscado.setTipoMembresia("Premium");
                            break;
                        case 3:
                            miembroBuscado.setTipoMembresia("Ultra");
                            break;
                        default:
                            System.out.println("No se realizaron cambios");
                    }
                    break;
            }
            System.out.println("Usuario actualizado");
            miembroBuscado.mostrarUsr();
            scn.nextLine();
        } else {
            System.out.println("Usuario no encontrado");
        }
        scn.nextLine();
    }

    // FIN Funciones para actualizar información

    // INICIO Funciones de Libros

    public void prestarLibro(Map<String, Libro> libros, Map<String, Miembro> miembros, String id) {

        Scanner scn = new Scanner(System.in);
        Miembro usrBuscado = miembros.get(id);
        if (usrBuscado != null) {

            System.out.print("ISBN: ");
            String isbnAux = scn.nextLine();
            Libro libBuscado = libros.get(isbnAux);
            if (libBuscado != null && libBuscado.getCopiasDisponibles() > 0) {
                usrBuscado.agregarPrestamo(libBuscado);
                libBuscado.setCopiasDisponibles(libBuscado.getCopiasDisponibles() - 1);
                libBuscado.configurarFechas();
                System.out.print("\033[H\033[2J");
                System.out.println("El libro fue prestado con éxito");
                libBuscado.imprimirDatosLibro();
                System.out.println("Fecha Prestamo: " + libBuscado.getFechaPrestamo());
                System.out.println("Fecha Entrega: " + libBuscado.getFechaEntrega());
            } else {
                System.out.println("No disponible");
            }
        } else {
            System.out.println("Usuario no encontrado");
        }
        scn.nextLine();
    }

    public void devolverLibro(Map<String, Libro> libros, Map<String, Miembro> miembros, String id) {

        Scanner scn = new Scanner(System.in);
        Miembro usrBuscado = miembros.get(id);
        if (usrBuscado != null) {

            System.out.print("ISBN: ");
            String isbnAux = scn.nextLine();
            Libro libBuscado = libros.get(isbnAux);
            if (libBuscado != null) {
                libBuscado.setCopiasDisponibles(libBuscado.getCopiasDisponibles() + 1);
                usrBuscado.devolverPrestamo(libBuscado);
                System.out.print("\033[H\033[2J");
                System.out.println("Libro devuelto con éxito");
                libBuscado.imprimirDatosLibro();
            }
        }
        scn.nextLine();
    }

    public void agregarLibro(Map<String, Libro> libros) {

        Scanner scn = new Scanner(System.in);
        Libro libroNuevo = new Libro();
        libros.put(libroNuevo.getISBN(), libroNuevo);
        System.out.print("\033[H\033[2J");
        System.out.println("Libro agregado con éxito");
        libroNuevo.imprimirDatosLibro();
        scn.nextLine();
    }

    public void eliminarLibro(Map<String, Libro> libros) {

        Scanner scn = new Scanner(System.in);
        System.out.print("ISBN: ");
        String isbnAux = scn.nextLine();
        libros.remove(isbnAux);
        System.out.println("Libro eliminado con éxito");
        scn.nextLine();
    }

    // FIN Funciones de Libros

    // Funciones para mostrar el inventario

    public void mostrarLibAutor(Map<String, Libro> libros, String autor) {

        Scanner scn = new Scanner(System.in);
        for (Map.Entry<String, Libro> i: libros.entrySet()) {
            if (i.getValue().getAutor().equals(autor)) {
                System.out.print(i.getKey() + ": ");
                System.out.print(i.getValue().getTitulo());
            }
        }
        scn.nextLine();
    }

    public void mostrarLibGenero(Map<String, Libro> libros, String genero) {

        for (Map.Entry<String, Libro> i: libros.entrySet()) {
            if (i.getValue().getGenero().equals(genero)) {
                System.out.print(i.getKey() + ": ");
                System.out.print(i.getValue().getTitulo());
            }
        }
    }

    public void mostrarLibPublicacion(Map<String, Libro> libros, int publi) {

        for (Map.Entry<String, Libro> i: libros.entrySet()) {
            if (i.getValue().getAnoDePublicacion() == publi) {
                System.out.print(i.getKey() + ": ");
                System.out.print(i.getValue().getTitulo());
            }
        }
    }

    public void mostrarInvLibros(Map<String, Libro> libros) {

        System.out.println("Como los desea ordenar");
        System.out.println("1. Autor");
        System.out.println("2. Género");
        System.out.println("3. Año de publicación");
        Scanner scn = new Scanner(System.in);
        int opc = scn.nextInt();
        scn.nextLine();
        switch (opc) {
            case 1:
                System.out.print("Autor: ");
                String autor = scn.nextLine();
                mostrarLibAutor(libros, autor);
                break;
            case 2:
                System.out.print("Genero: ");
                String genero = scn.nextLine();
                mostrarLibGenero(libros, genero);
                break;
            case 3:
                System.out.print("Autor: ");
                int publi = scn.nextInt();
                mostrarLibPublicacion(libros, publi);
                break;
            default:
                System.out.println("Mostrando por orden de alta");
                for (Map.Entry<String, Libro> i: libros.entrySet()) {
                    System.out.print(i.getKey() + ": ");
                    System.out.println(i.getValue().getTitulo());
                    System.out.println("\n");
                }
                break;
        }
        scn.nextLine();
    }
}
