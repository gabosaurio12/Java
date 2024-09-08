package org.mayus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JTextField campo;

    public Main() {
        b1 = new JButton("MAYUS");
        b1.addActionListener(this);
        b2 = new JButton("minus");
        b2.addActionListener(this);
        b3 = new JButton("Limpiar");
        b3.addActionListener(this);
        campo = new JTextField();
        this.getContentPane().add(b1, BorderLayout.WEST);
        this.getContentPane().add(b2, BorderLayout.EAST);
        this.getContentPane().add(b3, BorderLayout.SOUTH);
        this.getContentPane().add(campo, BorderLayout.NORTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String texto = campo.getText().toUpperCase();
            campo.setText(texto+"");
        } else if (e.getSource() == b2) {
            String texto = campo.getText().toLowerCase();
            campo.setText(texto+"");
        } else {
            campo.setText("");
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setPreferredSize(new Dimension(200,200));
        app.pack();
        app.setVisible(true);

    }
}
