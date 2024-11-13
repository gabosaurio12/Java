package com.pokemon.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    public LoginForm() {
        setTitle("Inicio de Sesion");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setForeground(Color.RED);

        JButton loginButton = new JButton("Iniciar Sesion");
        loginButton.addActionListener(new LoginAction());

        panel.add(new JLabel("User:", SwingConstants.CENTER));
        panel.add(usernameField);
        panel.add(new JLabel("Password:", SwingConstants.CENTER));
        panel.add(passwordField);

        add(panel, BorderLayout.CENTER);
        add(loginButton, BorderLayout.SOUTH);
        add(messageLabel, BorderLayout.NORTH);
    }

    private class LoginAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (authenticate(username, password)) {
                messageLabel.setText("Inicio de sesión exitoso");
                JOptionPane.showMessageDialog(LoginForm.this, "Bienvenido " + username);
                dispose();
                new PokemonManager();
            } else {
                messageLabel.setText("Usuario o contraseña incorrectos");
            }
        }

        private boolean authenticate(String username, String password) {
            return username.equals("admin") && password.equals("1234");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
        });
    }
}

