package com.pelotachica;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JPanel {

    Pelota pelota = new Pelota(this, 30, 0, 0);

    private void mover() {
        pelota.mover();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        pelota.paint(g2d);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Pelota chica");
        Ventana ventana = new Ventana();
        frame.add(ventana);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            ventana.mover();
            ventana.repaint();
            Thread.sleep(10);
        }
    }
}
