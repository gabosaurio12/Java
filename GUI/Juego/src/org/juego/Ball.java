package org.juego;

import java.awt.*;

public class Ball {
    private static final int DIAMETRO = 30;
    int x = 0;
    int y = 0;
    int xa = 1;
    int ya = 1;
    private Juego juego;

    public Ball(Juego juego) {
        this.juego = juego;
    }

    void move() {

        if (x + xa < 0) {
            xa = juego.velocidad;
        } else if (x + xa > juego.getWidth() - DIAMETRO) {
            xa = -juego.velocidad;
        } else if (y + ya < 0) {
            ya = juego.velocidad;
        } else if (y + ya > juego.getHeight() - DIAMETRO) {
            juego.gameOver();
        } else if (colision()) {
            ya = -juego.velocidad;
            y = juego.raqueta.getTopY() - DIAMETRO;
            juego.raqueta.cambiarColor();
            juego.velocidad++;
        }

        x += xa;
        y += ya;
    }

    private boolean colision() {
        return juego.raqueta.getBounds().intersects(getBounds());
    }

    public void paint(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, DIAMETRO, DIAMETRO);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETRO, DIAMETRO);
    }
}
