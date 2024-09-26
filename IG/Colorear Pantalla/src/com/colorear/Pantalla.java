package com.colorear;

import javax.swing.*;
import java.awt.*;

public class Pantalla extends JPanel {
    private int contador;
    int x = 0;
    int y = 0;

    public int getContador() { return contador; }

    public void pintar() {
        x += 1;
        y += 1;
    }
    
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Paint");
        Pantalla pantalla = new Pantalla();
        frame.add(pantalla);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            pantalla.pintar();
            pantalla.repaint();
            Thread.sleep(10);
        }
    }
}
