package db.dao;

import java.sql.SQLException;

public interface LoginDAO {
    boolean authenticateUser(String userName, String userPassword) throws SQLException;
}