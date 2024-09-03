package org.correo;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Interfaz app = new Interfaz();
        app.setPreferredSize(new Dimension(250,200));
        app.pack();
        app.setVisible(true);
    }
}
