package db.pokemonmanagertest;

import db.pokemon.Pokemon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokeManTest {

    @Test
    public void pokemonManagerTest() throws SQLException {
        PokeManDAOImp pokeMan = new PokeManDAOImp();
        pokeMan.reset();
        ArrayList<String> names = new ArrayList<>();
        names.add("Bulbasaur");
        names.add("Charmander");
        names.add("Squirtle");

        for (int i = 0; i < 3; i++) {
            pokeMan.addPokemon(new Pokemon(names.get(i)));
        }

        for (int i = 0; i < 3; i++) {
            assertTrue(pokeMan.searchPokemon(names.get(i)), "El pokemon debe ser encontrado");
        }
    }
}
