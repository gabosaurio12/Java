package com.ppt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Pantalla extends JPanel {
	private JButton piedra;
	private JButton papel;
	private JButton tijeras;

	public Pantalla() {
		piedra = new JButton("Piedra");
		piedra.addActionListener(this);
		papel = new JButton("Papel");
		papel.addActionListener(this);
		tijeras = new JButton("Tijeras");
		tijeras.addActionListener(this);

		this.getContentPane().add(piedra, BorderLayout.WEST);
		this.getContentPane().add(papel, BorderLayout.SOUTH);
		this.getContentPane().add(tijeras, BorderLayout.EAST);
	}

}