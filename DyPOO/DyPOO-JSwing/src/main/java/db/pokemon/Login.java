package db.pokemon;

import db.dao.LoginDAOImp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    public Login() {
        setTitle("Inicio de Sesión");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();

        setVisible(true);
        pack();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setForeground(Color.RED);

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.addActionListener(new LoginAction());

        panel.add(new JLabel("User:", SwingConstants.CENTER));
        panel.add(usernameField);
        panel.add(new JLabel("Password:", SwingConstants.CENTER));
        panel.add(passwordField);

        add(panel, BorderLayout.CENTER);
        add(loginButton, BorderLayout.SOUTH);
        add(messageLabel, BorderLayout.NORTH);
    }

    public class LoginAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            try {
                if (new LoginDAOImp().authenticateUser(username, password)) {
                    messageLabel.setText("Inicio de sesión exitoso");
                    JOptionPane.showMessageDialog(Login.this, "Bienvenido " + username);
                    dispose();
                    new PokemonManager().setVisible(true);
                } else {
                    messageLabel.setText("Usuario o contraseña incorrectos");
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
<<<<<<< HEAD:DyPOO/DyPOO-JSwing/src/main/java/db/pokemon/Login.java
=======

        private boolean authenticate(String username, String password) {
            return username.equals("admin") && password.equals("1234♠");
        }
>>>>>>> 372bb242cc40de28fdec86b98b9c5a80ddad7353:DyPOO/DyPOO-JSwing/src/main/java/db/pokemon/LogIn.java
    }

}
