package com.tren;

public class Main {
    public static void main(String[] args) {
        Tren n = new Tren();
        n.agregarVagones(new Vagon(80000));
        n.agregarVagones(new Vagon(120000));
        n.agregarVagones(new Vagon(70000));
        n.agregarVagones(new Vagon(280000));
        n.agregarVagones(new Vagon(35000));
        System.out.println(n);
        n.getInfo();
    }
}