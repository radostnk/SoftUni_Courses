package Advanced.E_DefiningClasses.PockemonTrainer;

import java.util.List;

public class Trainer {
    private String name;
    private int badgesNum;
    private List<Pokemon> pokemons;

    public Trainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.badgesNum = 0;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadgesNum() {
        return badgesNum;
    }

    public void setBadgesNum(int badgesNum) {
        this.badgesNum = badgesNum;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
