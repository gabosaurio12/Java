package db.pokemonmanagertest;

import db.database.DataBaseConnection;
import db.pokemon.Pokemon;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PokeManDAOImp implements PokeManDAO {
    private final String tableName = "poke_test";

    @Override
    public void addPokemon(Pokemon pokemon) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String query = "INSERT INTO " + tableName + " (name, type) VALUES (?, ?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, pokemon.getName());
        ps.setString(2, pokemon.getType());
        ps.execute();
    }

    @Override
    public boolean searchPokemon(String name) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String query = "SELECT name FROM " + tableName + " WHERE name = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    @Override
    public void reset() throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String query = "TRUNCATE TABLE " + tableName + ";";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.execute();
    }
}
