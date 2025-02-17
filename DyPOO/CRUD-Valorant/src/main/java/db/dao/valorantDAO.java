package db.dao;

import java.sql.SQLException;

public interface valorantDAO {
    public void addAgent() throws SQLException;

    public void fireAgent() throws SQLException;

    public void editAgent() throws SQLException;
}
