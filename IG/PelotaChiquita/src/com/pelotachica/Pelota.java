package com.pelotachica;

import java.awt.*;

public class Pelota {
    private Ventana ventana;
    int diametro;
    int x;
    int y;
    int xa = 2;
    int ya = 2;

    public Pelota(Ventana ventana, int diametro, int x, int y) {
        this.ventana = ventana;
        this.diametro = diametro;
        this.x = x;
        this.y = y;
    }

    public void mover() {
        if (y > ventana.getHeight() - diametro || y < 0) {
            ya = -ya;
            diametro -= 1;
        }

        if (x > ventana.getWidth() - diametro || x < 0) {
            xa = -xa;
            diametro -= 1;
        }

        x += xa;
        y += ya;
    }

    public void paint(Graphics2D g) {
        g.fillOval(x, y, diametro, diametro);
    }
}
