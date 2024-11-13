package db.pokemon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
        setVisible(true);
    }

    private void initComponents() {
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel searchLabel = new JLabel("Buscar Pokemon");
        topPanel.add(searchLabel, BorderLayout.WEST);
        topPanel.add(searchField, BorderLayout.CENTER);

        JButton addButton = new JButton("Agregar");
        JButton editButton = new JButton("Editar");
        JButton deleteButton = new JButton("Eliminar");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(pokemonList), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        searchField.addActionListener(e -> filterPokemonList());

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
            }
        } else {
            JOptionPane
                    .showMessageDialog(this, "Seleccione un Pokemon para actualizar.");
        }
    }*/

    private void deletePokemon() {
        Pokemon selectedPokemon = pokemonList.getSelectedValue();
        if (selectedPokemon != null) {
            pokemons.remove(selectedPokemon);
            updatePokemonList();
        } else {
            JOptionPane
                    .showMessageDialog(this,
                            "Seleccione un Pokemon para eliminar.");
        }
    }


}
