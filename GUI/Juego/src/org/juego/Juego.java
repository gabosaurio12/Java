package org.juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class Juego extends JPanel {

    Ball ball = new Ball(this);
    Raqueta raqueta = new Raqueta(this);
    int velocidad = 1;

    private int getScore() {
        return velocidad - 1;
    }

    public Juego() {

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                raqueta.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {

                raqueta.keyReleased(e);
            }
        });
        setFocusable(true);
    }

    private void move() {

        ball.move();
        raqueta.move();
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        g.setColor(new Color(0, 100, 0));
        g.fillRect(0, 0, getWidth(), getHeight());
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        ball.paint(g2d);
        raqueta.paint(g2d);

        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Verdadna", Font.BOLD, 30));
        g2d.drawString(String.valueOf(getScore()), 10, 30);
    }

    public void gameOver() {

        int respuesta = JOptionPane.showConfirmDialog(this, "Game Over. ¿Reiniciar?", "Game Over", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();

            JFrame nuevoFrame = new JFrame("Mini Tennis");
            Juego nuevoJuego = new Juego();
            nuevoFrame.add(nuevoJuego);
            nuevoFrame.setSize(300,400);
            nuevoFrame.setVisible(true);
            nuevoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            while (true) {
                nuevoJuego.move();
                nuevoJuego.repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
                System.exit(ABORT);
            }
    }

    public static void main(String[] args) throws  InterruptedException{

        JFrame frame = new JFrame("Mini Tennis");
        Juego juego = new Juego();
        frame.add(juego);
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            juego.move();
            juego.repaint();
            Thread.sleep(10);
        }
    }
}
