package db.dao;

import db.database.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAOImp implements LoginDAO {
    private final String tableName;

    public LoginDAOImp() {
        tableName = "Users";
    }

    @Override
    public boolean authenticateUser(String userName, String userPassword) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String query = "SELECT * FROM " + tableName + "  WHERE user_name = ? AND user_password = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, userName);
        ps.setString(2, userPassword);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }
}
