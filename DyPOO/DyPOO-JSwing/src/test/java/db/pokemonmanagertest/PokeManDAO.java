package db.pokemonmanagertest;

import db.pokemon.Pokemon;

import java.sql.SQLException;

public interface PokeManDAO {
    public void addPokemon(Pokemon pokemon) throws SQLException;

    public boolean searchPokemon(String name) throws SQLException;

    public void reset() throws SQLException;
}
