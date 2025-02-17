package db.logintest;

import db.dao.LoginDAOImp;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginTest {

    @Test
    public void testLogin() throws SQLException {
        LoginDAOImp login = new LoginDAOImp();

        for (int i = 1; i < 6; i++) {
            User user = new WrongUsersDAOImp().getUser(i);
            boolean result = login.authenticateUser(user.getName().trim(), user.getPassword().trim());

            if (i == 5) {
                assertTrue(result, "El login debe ser aceptado");
            } else {
                assertFalse(result, "El login debe ser rechazado");
            }
        }
    }
}
