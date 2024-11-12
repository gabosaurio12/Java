package com.pokemon.dao;

import com.pokemon.connection.DataBaseConnection;
import com.pokemon.model.Pokemon;
import com.pokemon.model.PokemonType;

import javax.xml.transform.Result;
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
        ps.setString(pokemon.getPokeName(), pokemon.getPokeType());
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
        String query = "SELECT pokemon.id, name, weight, height, base_experience, type_id FROM pokemon ";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            pokemones.add(new Pokemon(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getDouble(4),
                    rs.getInt(5),
                    typedao.read(rs.getInt(6))
            );
        }
        return pokemones;
    }
}
