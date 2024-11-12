package org.biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void interfazUsuario(String id, Map<String, Libro> libros, Map<String, Miembro> miembros) {

        System.out.print("\033[H\033[2J");
        Miembro usr = miembros.get(id);
        if (usr != null) {
            Scanner scn = new Scanner(System.in);
            Gestion gestion = new Gestion();

            System.out.println("Bienvenid@ " + usr.getNombre());
            System.out.println("1. Prestamos");
            System.out.println("2. Membresía");
            System.out.println("3. Cerrar sesión");
            int opc = scn.nextInt();
            scn.nextLine();
            System.out.print("\033[H\033[2J");
            switch (opc) {
                case 1:
                    System.out.println("1. Solicitar Préstamo");
                    System.out.println("2. Devolver Préstamo");
                    System.out.println("3. Mostrar Inventario");
                    System.out.println("4. Mis préstamos");
                    System.out.println("5. Regresar");
                    opc = scn.nextInt();
                    System.out.print("\033[H\033[2J");
                    switch (opc) {
                        case 1:
                            gestion.prestarLibro(libros, miembros, id);
                            interfazUsuario(id, libros, miembros);
                            break;
                        case 2:
                            gestion.devolverLibro(libros, miembros, id);
                            interfazUsuario(id, libros, miembros);
                            break;
                        case 3:
                            gestion.mostrarInvLibros(libros);
                            interfazUsuario(id, libros, miembros);
                        case 4:
                            gestion.mostrarPrestamos(miembros, id);
                            interfazUsuario(id, libros, miembros);
                            break;
                        default:
                            interfazUsuario(id, libros, miembros);
                    }
                    break;
                case 2:
                    System.out.println("1. Ver mis datos");
                    System.out.println("2. Editar cuenta");
                    System.out.println("3. Cancelar membresía");
                    System.out.println("4. Regresar");
                    opc = scn.nextInt();
                    System.out.print("\033[H\033[2J");
                    switch (opc) {
                        case 1:
                            usr.mostrarUsr();
                            interfazUsuario(id, libros, miembros);
                            break;
                        case 2:
                            gestion.actualizarInfoMiembro(id,miembros);
                            interfazUsuario(id, libros, miembros);
                            break;
                        case 3:
                            gestion.cancelarMembresia(miembros, id);
                            break;
                        default:
                            interfazUsuario(id, libros, miembros);
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static void interfazAdmin(Map<String, Libro> libros, Map<String, Miembro> miembros) {

        System.out.print("\033[H\033[2J");
        Scanner scn = new Scanner(System.in);
        Gestion gestion = new Gestion();
        Archivo arch = new Archivo();

        System.out.println("Bienvenid@ Administrador");
        System.out.println("1. Libros");
        System.out.println("2. Usuarios");
        System.out.println("3. Registros");
        System.out.println("4. Cerrar sesion");
        int opc = scn.nextInt();
        scn.nextLine();
        System.out.print("\033[H\033[2J");
        switch (opc) {
            case 1:
                System.out.println("1. Agregar libro");
                System.out.println("2. Eliminar libro");
                System.out.println("3. Prestamo de libro");
                System.out.println("4. Devolver libro");
                System.out.println("5. Editar libro");
                System.out.println("6. Mostrar inventario");
                System.out.println("7. Regresar");
                opc = scn.nextInt();
                System.out.print("\033[H\033[2J");
                switch (opc) {
                    case 1:
                        gestion.agregarLibro(libros);
                        interfazAdmin(libros, miembros);
                        break;
                    case 2:
                        gestion.eliminarLibro(libros);
                        interfazAdmin(libros, miembros);
                        break;
                    case 3:
                        String id = scn.nextLine();
                        gestion.prestarLibro(libros, miembros, id);
                        break;
                    case 4:
                        id = scn.nextLine();
                        gestion.devolverLibro(libros, miembros, id);
                        break;
                    case 5:
                        System.out.println("ISBN: ");
                        String isbn = scn.nextLine();
                        gestion.actualizarInformacionLibro(isbn, libros);
                        interfazAdmin(libros, miembros);
                        break;
                    case 6:
                        gestion.mostrarInvLibros(libros);
                        break;
                    default:
                        interfazAdmin(libros, miembros);
                }
                break;
            case 2:
                System.out.println("1. Ver todos los miembros");
                System.out.println("2. Registrar miembro");
                System.out.println("3. Editar miembro");
                System.out.println("4. Cancelar membresía");
                System.out.println("5. Mostrar préstamos");
                System.out.println("6. Regresar");
                opc = scn.nextInt();
                System.out.print("\033[H\033[2J");
                switch (opc) {
                    case 1:
                        gestion.mostrarMiembros(miembros);
                        interfazAdmin(libros, miembros);
                        break;
                    case 2:
                        gestion.registrarMiembro(miembros);
                        interfazAdmin(libros, miembros);
                        break;
                    case 3:
                        String id = scn.nextLine();
                        gestion.actualizarInfoMiembro(id, miembros);
                        interfazAdmin(libros, miembros);
                    case 4:
                        id = scn.nextLine();
                        gestion.cancelarMembresia(miembros, id);
                        interfazAdmin(libros, miembros);
                        break;
                    case 5:
                        System.out.println("ID: ");
                        id = scn.nextLine();
                        gestion.mostrarPrestamos(miembros, id);
                        interfazAdmin(libros, miembros);
                        break;
                    default:
                        interfazAdmin(libros, miembros);
                        break;
                }
                scn.nextLine();
                break;
            case 3:
                arch.historialPrestamos("registros.txt");
                scn.nextLine();
            default:
                break;
        }
    }

    public static void interfazExterior(Map<String, Libro> libros, Map<String, Miembro> miembros) {

        System.out.print("\033[H\033[2J");
        Scanner scn = new Scanner(System.in);
        Gestion gestion = new Gestion();

        System.out.println("Bienvenid@ Usuari@ Extern@");
        System.out.println("1. Registrarse");
        System.out.println("2. Inventario de libros");
        System.out.println("3. Regresar");
        int opc = scn.nextInt();
        scn.nextLine();
        System.out.print("\033[H\033[2J");
        switch (opc) {
            case 1:
                gestion.registrarMiembro(miembros);
                break;
            case 2:
                gestion.mostrarInvLibros(libros);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Map<String, Libro> libros = new HashMap<>();
        Map<String, Miembro> miembros = new HashMap<>();

        boolean band = true;

        while (band) {
            System.out.print("\033[H\033[2J");
            System.out.println("BIBLIOTECA");
            System.out.println("1. Ingresar ID"); // se ingresa un id
            System.out.println("2. Ingresar como Admin"); // solo si se ingresa la contraseña se puede entrar (PSSW: 255)
            System.out.println("3. Ingresar como Usuario exterior");
            System.out.println("4. Salir");
            int opc = scn.nextInt();
            scn.nextLine();
            System.out.print("\033[H\033[2J");
            switch (opc) {
                case 1:
                    System.out.println("Ingresa tu ID ");
                    String id = scn.nextLine();
                    System.out.print("\033[H\033[2J");
                    interfazUsuario(id, libros, miembros);
                    break;
                case 2:
                    System.out.println("Ingresa la Contraseña ");
                    String pssw = scn.nextLine();
                    System.out.print("\033[H\033[2J");
                    if (pssw.equals("255")) {
                        interfazAdmin(libros, miembros);
                    }
                    break;
                case 3:
                    interfazExterior(libros, miembros);
                    break;
                default:
                    band = false;
                    break;
            }
        }
    }
}
