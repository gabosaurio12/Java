package org.juego;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Raqueta {
    private static final int Y = 330;
    private static final int ANCHO = 60;
    private static final int ALTO = 10;
    int x = 120;
    int xa = 0;
    private Juego juego;
    private boolean reves = false;

    public Raqueta(Juego juego) {
        this.juego = juego;
    }

    public void move() {

        if (x + xa > 0 && x + xa < juego.getWidth() - ANCHO) {
            x += xa;
        }
    }

    public void cambiarColor() {
        reves = !reves;
    }

    public void paint(Graphics2D g) {

        if (reves) {
            g.setColor(Color.BLACK);
        } else {
            g.setColor(new Color(208, 37, 0));
        }
        g.fillRect(x, Y, ANCHO, ALTO);
    }

    public void keyReleased(KeyEvent e) {
        xa = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            xa = -juego.velocidad;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            xa = juego.velocidad;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, Y, ANCHO, ALTO);
    }

    public int getTopY() {
        return Y - ALTO;
    }
}
