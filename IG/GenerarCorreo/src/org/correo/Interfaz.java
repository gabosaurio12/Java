package org.correo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame implements ActionListener {

    private JButton boton1;
    private JButton boton2;
    private JTextField campo;

    public Interfaz() {
        boton1 = new JButton("Email");
        boton1.addActionListener(this);
        boton2 = new JButton("Limpiar");
        boton2.addActionListener(this);
        campo = new JTextField();

        this.getContentPane().add(campo, BorderLayout.NORTH);
        this.getContentPane().add(boton1, BorderLayout.WEST);
        this.getContentPane().add(boton2, BorderLayout.EAST);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String email = "z";
            String texto = campo.getText().concat("@estudiantes.uv.mx");
            email = email.concat(texto);
            campo.setText(email + "");
        } else {
            campo.setText("");
        }
    }
}