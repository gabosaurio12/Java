package db.dao;
import db.pokemon.Pokemon;

import java.sql.SQLException;
import java.util.List;

public interface PokemonDAO {
    public void create(Pokemon pokemon) throws SQLException;

    public Pokemon readPokemon(int id) throws SQLException;

    public void update(Pokemon pokemon) throws SQLException;

    public void delete(Pokemon pokemon) throws SQLException;

    public List<Pokemon> readAll() throws SQLException;
}
