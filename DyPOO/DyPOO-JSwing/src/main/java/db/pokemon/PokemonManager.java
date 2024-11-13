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
        searchField = new JTextField();

        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel searchLabel = new JLabel(("Buscar Pokemon"));
    }
}
