package org.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private JButton b1;
    private JTextField campo1;
    private JTextField campo2;
    private JLabel etq1;
    private JLabel etq2;
    private Panel panelEntrada, panelSalida;
    private JPanel panelDeLaVentana;

    public Main() {
        b1 = new JButton("Seno");

        b1.addActionListener(this);

        etq1 = new JLabel("Angulo: ");
        etq2 = new JLabel("Resultado: ");

        campo1 = new JTextField();
        campo2 = new JTextField();

        campo1.setColumns(10);
        campo2.setEditable(false);
        campo2.setColumns(10);
        campo2.setBackground(Color.lightGray);

        panelEntrada = new Panel();
        panelSalida = new Panel();

        panelDeLaVentana = (JPanel)this.getContentPane();

        panelEntrada.add(campo1, BoxLayout.X_AXIS);
        panelEntrada.add(etq1, BoxLayout.X_AXIS);

        panelSalida.add(campo2, BoxLayout.X_AXIS);
        panelSalida.add(etq2, BoxLayout.X_AXIS);

        panelDeLaVentana.add(panelEntrada, BorderLayout.NORTH);
        panelDeLaVentana.add(b1, BorderLayout.CENTER);
        panelDeLaVentana.add(panelSalida, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        double angulo = Double.parseDouble(campo1.getText());
        double resultado = Math.sin(angulo);
        campo2.setText(resultado+"");
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setBounds(10, 10, 200, 200);
        app.pack();
        app.setVisible(true);
    }
}
