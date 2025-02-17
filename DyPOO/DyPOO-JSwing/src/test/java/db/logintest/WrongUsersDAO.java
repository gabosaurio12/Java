package db.logintest;

import java.sql.SQLException;

public interface WrongUsersDAO {
    public User getUser(int id) throws SQLException;
}
