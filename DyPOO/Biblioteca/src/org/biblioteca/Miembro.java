package org.biblioteca;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Miembro {

    private String id;
    private String nombre;
    private String direccion;
    private String tipoMembresia;
    private int anoRegistro;
    private int limitePrestamos;
    private List<Libro> prestamos;
    private int multa;

    public Miembro(int numeroCliente) {
        Scanner scn = new Scanner(System.in);
        String nombre, direccion, tipoMembresia;

        System.out.print("Nombre: ");
        nombre = scn.nextLine();

        System.out.print("Direccion: ");
        direccion = scn.nextLine();
        
        System.out.println("Tipo de Membresia: ");
        System.out.println("1. Standard");
        System.out.println("2. Premium");
        System.out.println("3. Ultra");
        int opc = scn.nextInt();
        scn.nextLine();
        switch (opc) {
            case 2:
                tipoMembresia = "Premium";
                break;
            case 3:
                tipoMembresia = "Ultra";
                break;
            default:
                tipoMembresia = "Standard";
                break;
        }

        LocalDate fecha = LocalDate.now();
        int anoRegistro = fecha.getYear();

        this.id = generarId(nombre, tipoMembresia, anoRegistro, numeroCliente);
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoMembresia = tipoMembresia;
        this.anoRegistro = anoRegistro;
        this.limitePrestamos = asignarLimite(tipoMembresia);
        this.prestamos = new ArrayList<Libro>(limitePrestamos);
    }

    // INICIO Getters y Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public int getAnoRegistro() {
        return anoRegistro;
    }

    public void setAnoRegistro(int anoRegistro) {
        this.anoRegistro = anoRegistro;
    }

    public int getLimitePrestamos() {
        return limitePrestamos;
    }

    public void setLimitePrestamos(int limitePrestamos) {
        this.limitePrestamos = limitePrestamos;
    }

    public int getPrestamos() {
        return prestamos.size();
    }

    public void setPrestamos(List<Libro> prestamos) {
        this.prestamos = prestamos;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    // FIN Getters y Setters

    // INICIO FUNCIONES auxiliares para constructor

    public int asignarLimite(String tipoMem) {
        int lim = 0;
        switch (tipoMem) {
            case "Standard":
                lim = 5;
                break;
            case "Premium":
                lim = 10;
                break;
            case "Ultra":
                lim = 15;
                break;
        }
        return lim;
    }

    // INICIA generarID

    public String generarId(String nombre, String tipoMembresia, int anoRegistro, int numCliente) {

        String idAux = "";
        String nomApe = siglasNombre(nombre);
        String mem = siglasMembresia(tipoMembresia);
        String anoReg = String.valueOf(anoRegistro);
        String numCli = String.valueOf(numCliente + 1);
        idAux = idAux.concat(nomApe);
        idAux = idAux.concat(mem);
        idAux = idAux.concat(anoReg);
        idAux = idAux.concat(numCli);
        return idAux;
    }

    public String siglasNombre(String nombre) {
        String siglas = "";
        siglas += nombre.charAt(0);
        int i = 0;
        while (i < nombre.length() && nombre.charAt(i) != ' ') {
            i++;
        }
        if (i < nombre.length() - 1) {
            siglas += nombre.charAt(i + 1);
        }

        return siglas;
    }

    public String siglasMembresia(String tipo) {

        String mem = "";
        switch (tipo) {
            case "Standard":
                mem = "STD";
                break;
            case "Premium":
                mem = "PRM";
                break;
            case "Ultra":
                mem = "ULT";
                break;
        }
        return mem;
    }

    // FIN generarID

    // FIN Funciones auxiliares para constructor

    // INICIO Funciones de prestamos

    public void agregarPrestamo(Libro libroAgregado) {

        if (getLimitePrestamos() > 0) {
            Archivo arch = new Archivo();
            prestamos.add(libroAgregado);
            arch.registrarPrestamo(libroAgregado);
            limitePrestamos--;
        } else {
            System.out.println("Limite de prestamos alcanzado");
        }
    }

    public void devolverPrestamo(Libro libroDevolver) {

        Archivo arch = new Archivo();
        setMulta(calculcarMulta(libroDevolver));
        prestamos.remove(libroDevolver);
        arch.registrarDevolucion(libroDevolver);
        limitePrestamos++;
    }

    public int calculcarMulta(Libro libroDevolver) {
        LocalDate fechaAct = LocalDate.now();
        Period diasRetardo = libroDevolver.getFechaEntrega().until(fechaAct);
        int dias = diasRetardo.getDays();
        int deuda = dias * 20;
        if (deuda < 0) {
            deuda = 0;// $20 de multa por día
        }
        return deuda;
    }

    public void imprimirPrestamo(int i) {

        Libro libroAux = prestamos.get(i);
        System.out.println("ISBN: " + libroAux.getISBN());
        System.out.println("Titulo: " + libroAux.getTitulo());
        System.out.println("Copias Disponibles: " + libroAux.getCopiasDisponibles());
        System.out.println("Fecha de Préstamo: " + libroAux.getFechaPrestamo());
        System.out.println("Fecha de Entrega: " + libroAux.getFechaEntrega());
    }

    // FIN Funciones Préstamos

    // INICIO Función para mostrar usuario

    public void mostrarUsr() {

        Scanner scn = new Scanner(System.in);
        System.out.println("ID " + getId());
        System.out.println("Nombre " + getNombre());
        System.out.println("Dirección " + getDireccion());
        System.out.println("Tipo de Membresía " + getTipoMembresia());
        System.out.println("Año de Registro " + getAnoRegistro());
        System.out.println("Limite de Prestamos " + getLimitePrestamos());
        System.out.println("Multa " + getMulta());
        scn.nextLine();
    }

    // FIN Función para mostrar usuario
}
