package org.teamo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeAmo extends JFrame implements ActionListener {
    private JButton b1;
    private JTextField campo1;
    private int teamos = 0;

    public TeAmo() {
        b1 = new JButton("Click");
        b1.addActionListener(this);
        campo1 = new JTextField();
        this.getContentPane().add(b1, BorderLayout.NORTH);
        this.getContentPane().add(campo1, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        teamos++;
        if (teamos > 1) {
            campo1.setText(teamos + " TE AMOS!");
        } else {
            campo1.setText(teamos + " TE AMO!");
        }
    }

    public static void main(String[] args) {
        TeAmo app = new TeAmo();
        app.setPreferredSize(new Dimension(150,78));
        app.pack();
        app.setVisible(true);
    }
}
