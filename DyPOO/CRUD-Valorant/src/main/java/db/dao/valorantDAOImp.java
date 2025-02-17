package db.dao;

import db.databaseconnection.DataBaseConnection;
import db.model.Agent;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class valorantDAOImp implements valorantDAO {
    private final String tableName;

    public valorantDAOImp() {
        tableName = "agent";
    }

    @Override
    public void addAgent(Agent agent) throws SQLException {
        String query = "INSERT INTO " + tableName + " values (?, ?, ?, ?, ?)";
        try {
            Connection connection = DataBaseConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, agent.getAgent_id());
            ps.setBoolean(2, agent.isRadiant());
            ps.setString(3, agent.getTeam());
            ps.setString(4,agent.getExpertise());
            ps.setString(5, agent.getName());
            ps.execute();

        } catch (SQLException e) {

        }
    }

    @Override
    public void fireAgent() throws SQLException {

    }

    @Override
    public void editAgent() throws SQLException {

    }
}
