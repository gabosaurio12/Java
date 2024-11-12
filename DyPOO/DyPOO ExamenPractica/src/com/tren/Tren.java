package com.tren;

public class Tren {
    private double capacidadCarga;
    private ElementoTren[] elementos;
    private double longitud;
    private final int numElementos = 100;
    private double peso;
    private int tamActual;
    private int locomotoras;
    private int vagones;

    public Tren() {
        capacidadCarga = 0;
        elementos = new ElementoTren[numElementos];
        longitud = 0;
        peso = 0;
        tamActual = 0;

        agregarLocomotora(new Locomotora());
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getLocomotoras() {
        return locomotoras;
    }

    public int getVagones() {
        return vagones;
    }

    public void getInfo() {
        System.out.println("--- Dimensiones ---");
        System.out.println("Número de elementos: " + getTamActual());
        System.out.println("Locomotoras: " + getLocomotoras());
        System.out.println("Peso: " + getPeso());
        System.out.println("Longitud " + getLongitud());
        System.out.println("Capacidad de carga: " + getCapacidadCarga());
    }

    public double getLongitud() {
        return longitud;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public double getPeso() {
        return peso;
    }

    public int getTamActual() {
        return tamActual;
    }

    public void agregarLocomotora(Locomotora locomotora) {
        if (tamActual < numElementos) {
            locomotoras++;
            elementos[tamActual] = locomotora;
            this.ajustaDimensiones(locomotora);
        }

        /*if (numElementos == tamActual) {
            System.out.println("EL TREN YA CUENTA CON TODOS SUS ELEMENTOS");
            return;
        }
        elementos[tamActual] = locomotora;
        this.ajustaDimensiones(locmotora);*/
    }

    public void agregarVagones(Vagon vagon) {
        if (tamActual < numElementos) {
            double nuevoPeso = peso + vagon.getPeso();
            while (nuevoPeso > capacidadCarga && tamActual < numElementos - 1) {
                Locomotora l = new Locomotora();
                agregarLocomotora(l);
                nuevoPeso += l.getPeso();
            }
            vagones++;
            elementos [tamActual] = vagon;
            this.ajustaDimensiones(vagon);
        } else {
            System.out.println("EL TREN YA CUENTA CON TODOS SUS ELEMENTOS");
        }

        /*if (peso + vagon.getPeso() > capacidadCarga && tamActual < numElementos) {
            while (peso + vagon.getPeso() > capacidadCarga) {
                agregarLocomotora(new Locomotora());
            }
            elementos[tamActual] = vagon;
            ajustaDimensiones(vagon);
        } else if (tamActual < 100) {
            elementos[tamActual] = vagon;
            ajustaDimensiones(vagon);
        }

        if (numElementos == tamActual) {
            System.out.println("EL TREN YA CUENTA CON TODOS SUS ELEMENTOS");
            return;
        }
        double nuevoPeso = peso + vagon.getPeso();
        while (nuevoPeso > capacidadCarga) {
            Locomotora l = new Locomotora();
            agregarLocomotora(l);
            nuevoPeso += l.getPeso();
        }
        elementos[tamActual] = vagon;
        this.ajustaDimensiones(vagon);*/
    }

    public void ajustaDimensiones(ElementoTren elemento) {
        if (elemento.getTipo().equals("Locomotora")) {
            Locomotora l = (Locomotora) elemento; // se hace referencia al elemento, ya no lo trato como ElementoTren sino como uno Locomotora
            capacidadCarga += l.getCapacidadCarga();
        }

        longitud += elemento.getLongitud();
        peso += elemento.getPeso();
        tamActual++;
    }

    @Override
    public String toString() {
        String strTren = "";
        for (ElementoTren e : elementos) {
            if ( e != null)
                strTren += e;
        }
        return strTren;
    }
}
