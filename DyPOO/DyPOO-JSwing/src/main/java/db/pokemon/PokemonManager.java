package db.pokemon;

import db.dao.PokemonDAOImp;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PokemonManager extends JFrame {
    private DefaultListModel<Pokemon> pokemonListModel;
    private JList<Pokemon> pokemonList;
    private JTextField searchField;
    private ArrayList<Pokemon> pokemons;

    public PokemonManager() {
        setTitle("Gestión de Pokemon");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        pokemons = new ArrayList<>();
        pokemonListModel = new DefaultListModel<>();
        pokemonList = new JList<>(pokemonListModel);
        pokemonList.setCellRenderer((list, value, index, isSelected, cellHasFocus) -> {
            JLabel label = new JLabel(value.getName()); // Mostrar solo el nombre
            label.setOpaque(true);
            if (isSelected) {
                label.setBackground(list.getSelectionBackground());
                label.setForeground(list.getSelectionForeground());
            } else {
                label.setBackground(list.getBackground());
                label.setForeground(list.getForeground());
            }
            return label;
        });

        searchField = new JTextField();

        initComponents();
        loadInitialPokemons();
        setVisible(true);
    }

    private void initComponents() {
        JPanel topPanel = new JPanel(new BorderLayout());
<<<<<<< HEAD
        JLabel searchLabel = new JLabel(("Buscar Pokemon"));

=======
        JLabel searchLabel = new JLabel("Buscar Pokemon");
>>>>>>> 372bb242cc40de28fdec86b98b9c5a80ddad7353
        topPanel.add(searchLabel, BorderLayout.WEST);
        topPanel.add(searchField, BorderLayout.CENTER);

        JButton addButton = new JButton("Agregar");
<<<<<<< HEAD
        JButton updateButton = new JButton("Actualizar");
=======
        JButton editButton = new JButton("Editar");
>>>>>>> 372bb242cc40de28fdec86b98b9c5a80ddad7353
        JButton deleteButton = new JButton("Eliminar");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
<<<<<<< HEAD
        buttonPanel.add(updateButton);
=======
        buttonPanel.add(editButton);
>>>>>>> 372bb242cc40de28fdec86b98b9c5a80ddad7353
        buttonPanel.add(deleteButton);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(pokemonList), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        searchField.addActionListener(e -> filterPokemonList());

<<<<<<< HEAD
        addButton.addActionListener(e -> {
            try {
                addPokemon();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        updateButton.addActionListener(e -> {
            updatePokemon();
        });
        deleteButton.addActionListener(e -> {
            deletePokemon();
        });
    }

    private void loadInitialPokemons() {
        try {
            PokemonDAOImp pokeFunctions = new PokemonDAOImp();
            List<Pokemon> allPokemon = pokeFunctions.readAll();

            pokemons.clear();
            pokemons.addAll(allPokemon);

            for (Pokemon pokemon : allPokemon) {
                pokemonListModel.addElement(pokemon);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
=======
        addButton.addActionListener(e -> addPokemon());
        //editButton.addActionListener(e -> updatePokemon());
        deleteButton.addActionListener(e -> deletePokemon());

        loadInitialPokemons();
    }

    private void loadInitialPokemons() {
        pokemons.add(new Pokemon("Bulbasaur", "Planta"));
        pokemons.add(new Pokemon("Charmander", "Fuego"));
        pokemons.add(new Pokemon("Squirtle", "Agua"));
        updatePokemonList();
>>>>>>> 372bb242cc40de28fdec86b98b9c5a80ddad7353
    }

    private void updatePokemonList() {
        pokemonListModel.clear();
        for (Pokemon pokemon : pokemons) {
            pokemonListModel.addElement(pokemon);
        }
    }

    private void filterPokemonList() {
        String searchText = searchField.getText().toLowerCase();
        pokemonListModel.clear();
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getName().toLowerCase().contains(searchText)) {
                pokemonListModel.addElement(pokemon);
            }
        }
    }

<<<<<<< HEAD
    private void addPokemon() throws SQLException {
        String newPokemonName = JOptionPane
                .showInputDialog(this, "Ingrese el nombre del nuevo Pokemon:");
        if (newPokemonName != null && !newPokemonName.trim().isEmpty()) {
            String newPokemonType = JOptionPane
                    .showInputDialog(this, "Ingrese el tipo del nuevo Pokemon");

            if (newPokemonType != null && !newPokemonType.trim().isEmpty()) {
                Pokemon pokemon = new Pokemon(newPokemonName.trim(), newPokemonType.trim());
                pokemons.add(pokemon);
                pokemonListModel.addElement(pokemon);
                try {
                    PokemonDAOImp pokeFunctions = new PokemonDAOImp();
                    pokeFunctions.create(pokemon);
                } catch (SQLException e) {
                    JOptionPane
                            .showMessageDialog(this, "Error al guardar en la base de datos: " +
                                    e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane
                        .showMessageDialog(this, "El tipo del Pokemon no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            updatePokemonList();
        } else {
            JOptionPane
                    .showMessageDialog(this, "El nombre del Pokemon no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updatePokemon() {
        Pokemon selectedPokemon = pokemonList.getSelectedValue();
        if (selectedPokemon != null) {
            String updatedName = JOptionPane
                    .showInputDialog(this, "Actualizar nombre de Pokemon:", selectedPokemon);
            if (updatedName != null && !updatedName.trim().isEmpty()) {
                try {
                    selectedPokemon.setName(updatedName.trim());
                    updatePokemonList();
                    PokemonDAOImp pokeFunctions = new PokemonDAOImp();
                    pokeFunctions.update(selectedPokemon);
                } catch (SQLException e) {
                    JOptionPane
                            .showMessageDialog(this, "Error al actualizar pokemon: " +
                                    e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
=======
    private void addPokemon() {
        String newPokeName = JOptionPane
                .showInputDialog(this, "Ingrese el nombre del nuevo Pokemon:");
        if (newPokeName != null && !newPokeName.trim().isEmpty()) {
            pokemons.add(new Pokemon(newPokeName, "Normal"));
            updatePokemonList();
        }
    }

    /*private void updatePokemon() {
        String selectedPokemon = pokemonList.getSelectedValue();
        if (selectedPokemon != null) {
            String updatedPokemon = JOptionPane
                    .showInputDialog(this, "Actualizar nombre de Pokemon:", selectedPokemon);
            if (updatedPokemon != null && !updatedPokemon.trim().isEmpty()) {
                pokemons.set(pokemons.indexOf(selectedPokemon), updatedPokemon.trim());
                updatePokemonList();
>>>>>>> 372bb242cc40de28fdec86b98b9c5a80ddad7353
            }
        } else {
            JOptionPane
                    .showMessageDialog(this, "Seleccione un Pokemon para actualizar.");
        }
<<<<<<< HEAD
    }
=======
    }*/
>>>>>>> 372bb242cc40de28fdec86b98b9c5a80ddad7353

    private void deletePokemon() {
        Pokemon selectedPokemon = pokemonList.getSelectedValue();
        if (selectedPokemon != null) {
<<<<<<< HEAD
            try {
                PokemonDAOImp pokeFunctions = new PokemonDAOImp();
                pokeFunctions.delete(selectedPokemon);

                pokemons.remove(selectedPokemon);
                updatePokemonList();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar pokemon: "
                + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
=======
            pokemons.remove(selectedPokemon);
>>>>>>> 372bb242cc40de28fdec86b98b9c5a80ddad7353
            updatePokemonList();
        } else {
            JOptionPane
                    .showMessageDialog(this,
                            "Seleccione un Pokemon para eliminar.");
        }
    }

<<<<<<< HEAD
=======

>>>>>>> 372bb242cc40de28fdec86b98b9c5a80ddad7353
}
