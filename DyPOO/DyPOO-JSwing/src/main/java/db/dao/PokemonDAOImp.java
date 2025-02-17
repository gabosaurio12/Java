package db.dao;

import db.database.DataBaseConnection;
import db.pokemon.Pokemon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PokemonDAOImp implements PokemonDAO {
    private final String tableName;

    public PokemonDAOImp() {
        tableName = "Pokemon";
    }

    @Override
    public void create(Pokemon pokemon) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String insertQuery = "INSERT INTO " + tableName + " (poke_name, poke_type) VALUES (?, ?)";
        PreparedStatement ps = connection.prepareStatement(insertQuery);
        ps.setString(1, pokemon.getName());
        ps.setString(2, pokemon.getType());
        ps.execute();
    }

    @Override
    public Pokemon readPokemon(int id) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String query = "SELECT poke_id, poke_name, poke_type FROM " + tableName + " WHERE poke_id = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Pokemon pokemon = new Pokemon();
        if (rs.next()) {
            pokemon.setId(rs.getInt(1));
            pokemon.setName(rs.getString(2));
            pokemon.setType(rs.getString(3));
        }
        return pokemon;
    }

    @Override
    public void update(Pokemon pokemon) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String updateQuery = "UPDATE " + tableName + " SET poke_name = ? WHERE poke_id = ? ";
        PreparedStatement ps = connection.prepareStatement(updateQuery);
        ps.setString(1, pokemon.getName());
        ps.setInt(2, pokemon.getId());
        ps.executeUpdate();
    }

    @Override
    public void delete(Pokemon pokemon) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String query = "DELETE FROM " + tableName + " WHERE poke_id = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, pokemon.getId());
        ps.executeUpdate();
    }

    @Override
    public List<Pokemon> readAll() throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String query = "SELECT poke_id, poke_name, poke_type FROM " + tableName + ";";
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        List<Pokemon> pokemonList = new ArrayList<>();

        while (rs.next()) {
            Pokemon pokemon = new Pokemon();
            pokemon.setId(rs.getInt("poke_id"));
            pokemon.setName(rs.getString("poke_name"));
            pokemon.setType(rs.getString("poke_type"));
            pokemonList.add(pokemon);
        }
        return pokemonList;
    }


}
