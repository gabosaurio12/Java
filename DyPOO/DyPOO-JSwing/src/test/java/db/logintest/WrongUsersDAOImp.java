package db.logintest;

import db.database.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WrongUsersDAOImp implements WrongUsersDAO {

    @Override
    public User getUser(int id) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String query = "SELECT * FROM  test_users WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return new User(
                    rs.getInt("id"), rs.getString("name"), rs.getString("password"));
        }
        return null;
    }
}
