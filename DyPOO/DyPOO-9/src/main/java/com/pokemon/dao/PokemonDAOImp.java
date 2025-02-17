package com.pokemon.dao;

import com.pokemon.connection.DataBaseConnection;
import com.pokemon.model.Pokemon;
import com.pokemon.model.PokemonType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PokemonDAOImp implements PokemonDAO {
    private final String tableName;

    public PokemonDAOImp() {
        tableName = "PokemonType";
    }


    @Override
    public void create(Pokemon pokemon) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String insertQuery = "INSERT INTO " + tableName + "(name, type_id) VALUES (?, ?)";
        PreparedStatement ps = connection.prepareStatement(insertQuery);
        ps.setString(1, pokemon.getPokeType());
        ps.execute();
    }

    @Override
    public Pokemon read(int id) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getConnection();
        String query = "SELECT id, name FROM " + tableName + "WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Pokemon pokemon = new Pokemon();
        if (rs.next()) {
            pokemon.setId(rs.getInt(1));
            pokemon.setPokeName(rs.getString(2));
        }

        return pokemon;
    }

    @Override
    public void update(Pokemon pokemon) throws SQLException {
        Connection conn = DataBaseConnection.getInstance().getConnection();
        String query = "UPDATE " + tableName + " SET name = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, pokemon.getPokeName());
        ps.setInt(2, pokemon.getId());
        ps.executeUpdate();
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection conn = DataBaseConnection.getInstance().getConnection();
        String query = "DELETE FROM " + tableName + " WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public List<Pokemon> readAll() throws SQLException {
        List<Pokemon> pokemones = new ArrayList<>();
        PokemonDAOImp typedao = new PokemonDAOImp();
        Connection conn = DataBaseConnection.getInstance().getConnection();
        String query = "SELECT pokemon.id, name, type_id, type FROM pokemon ";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Pokemon pokemon = new Pokemon();
            pokemon.setId(rs.getInt(1));
            pokemon.setPokeName(rs.getString(2));
            pokemon.setPokeType(new PokemonType(rs.getInt(3), rs.getString(4)));
            typedao.read(rs.getInt(6));

            pokemones.add(pokemon);
        }
        return pokemones;
    }
}
