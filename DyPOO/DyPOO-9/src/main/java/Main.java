import com.pokemon.dao.PokemonTypeDAO;
import com.pokemon.dao.PokemonTypeDAOImp;
import com.pokemon.model.PokemonType;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            PokemonTypeDAO typeDAO = new PokemonTypeDAOImp();
            List<PokemonType> types = typeDAO.readAll();
            System.out.println("Lista de tipos de pokemon: ");
            for (PokemonType type : types) {
                System.out.println(type.getTypeName());
            }

            PokemonType nuevoTipo = new PokemonType(0, "Fuego");

            PokemonType tipo = typeDAO.read(13);
            System.out.println("Tipo de pokemon 13: " + tipo.getTypeName());

            typeDAO.delete(13);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
