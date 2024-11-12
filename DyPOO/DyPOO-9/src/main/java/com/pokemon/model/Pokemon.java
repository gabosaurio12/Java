package com.pokemon.model;

public class Pokemon {
    private int id;
    private String pokeName;
    private PokemonType pokeType;

    public Pokemon() {
    }

    public Pokemon(int id, String pokeName, PokemonType pokeType) {
        this.id = id;
        this.pokeName = pokeName;
        this.pokeType = pokeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPokeName() {
        return pokeName;
    }

    public void setPokeName(String pokeName) {
        this.pokeName = pokeName;
    }

    public String getPokeType() {
        return pokeType.getTypeName();
    }

    public void setPokeType(PokemonType pokeType) {
        this.pokeType = pokeType;
    }
}
