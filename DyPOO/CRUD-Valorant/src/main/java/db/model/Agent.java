package db.model;

public class Agent {
    private int agent_id;
    private String name;
    private boolean radiant;
    private String team;
    private String expertise;

    public Agent(int agent_id, String name, boolean radiant, String team, String expertise) {
        this.agent_id = agent_id;
        this.name = name;
        this.radiant = radiant;
        this.team = team;
        this.expertise = expertise;
    }

    public Agent() {}

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRadiant() {
        return radiant;
    }

    public void setRadiant(boolean radiant) {
        this.radiant = radiant;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
