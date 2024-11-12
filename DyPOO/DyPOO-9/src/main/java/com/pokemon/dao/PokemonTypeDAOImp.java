package com.pokemon.dao;

import com.pokemon.connection.DataBaseConnection;
import com.pokemon.model.Ability;
import com.pokemon.model.PokemonType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PokemonTypeDAOImp implements PokemonTypeDAO {
    private final String tableName;

    public PokemonTypeDAOImp() {
        tableName = "PokemonType";
    }

    @Override
    public void create(PokemonType pokemonType) throws SQLException {
        Connection conn = DataBaseConnection.getInstance().getConnection();
        String insertQuery = "INSERT INTO " + tableName + "(type_name ) VALUES (?)";
        PreparedStatement ps = conn.prepareStatement(insertQuery);
        ps.setString(1, pokemonType.getTypeName());
        ps.execute();
    }

    @Override
    public PokemonType read(int id) throws SQLException {
        Connection conn = DataBaseConnection.getInstance().getConnection();
        String query = "SELECT id, type_name FROM " + tableName + " WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        PokemonType pokemonType = new PokemonType();
        if (rs.next()) {
            pokemonType.setId(rs.getInt(1));
            pokemonType.setTypeName(rs.getString(2));
        }
        return pokemonType;
    }

    @Override
    public void update(PokemonType pokemonType) throws SQLException {
        Connection conn = DataBaseConnection.getInstance().getConnection();
        String query = "UPDATE " + tableName + " SET type_name = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, pokemonType.getTypeName());
        ps.setInt(2, pokemonType.getId());
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
    public List<PokemonType> readAll() throws SQLException {
        List<PokemonType> pokemones = new ArrayList<>();
        Connection conn = DataBaseConnection.getInstance().getConnection();
        String query = "SELECT pokemon.id, name, weight, height, base_experience, type_id, type_name \n " +
                "FROM pokemon INNER JOIN pokemontype \n" +
                "WHERE type_id = pokemontype.id\n" +
                "ORDER BY pokemon.id;";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            pokemones.add(new PokemonType(
                    rs.getInt(1),
                    rs.getString(2)
            ));
        }
        return pokemones;
    }

    @Override
    public void addAbility(Ability ability) throws SQLException {
        String sql = "{INSERT INTO PokemonAbility (id, ability_name) VALUES (?, ?)}";
        Connection conn = DataBaseConnection.getInstance().getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(2, ability.getAbilityName());
        ps.addBatch();

        System.out.println("Se agregó la nueva habilidad");
    }
}
