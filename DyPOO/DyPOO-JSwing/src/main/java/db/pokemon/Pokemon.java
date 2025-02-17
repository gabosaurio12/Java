package db.pokemon;

public class Pokemon {
    private int id;
    private String name;
    private String type;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Pokemon() {

    }

    public Pokemon(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " - " + type;
    }
}
