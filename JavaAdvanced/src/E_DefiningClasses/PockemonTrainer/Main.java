package E_DefiningClasses.PockemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();

        while (!command.equals("Tournament")) {
            String[] data = command.split("\\s+");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer(trainerName, new ArrayList<>()));
            }

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainers.get(trainerName).getPokemons().add(pokemon);

            command = scan.nextLine();
        }

        command = scan.nextLine();

        while (!command.equals("End")) {
            //"Fire", "Water", and "Electricity"
            //you must check if a trainer has at least 1 pokemon with the given element
            //if he does he receives 1 badge, otherwise, all his pokemon lose 10 health
            //if a pokemon falls to 0 or less health, he dies and must be deleted from the trainer's collection

            String checkElement = command;

            trainers.forEach((key, value) -> {
                if (value.getPokemons().stream().anyMatch(pok -> pok.getElement().equals(checkElement))) {
                    value.setBadgesNum(value.getBadgesNum() + 1);
                } else {
                    value.getPokemons().forEach(pok -> pok.setHealth(pok.getHealth() - 10));
                    value.getPokemons().removeIf(pok -> pok.getHealth() <= 0);
                }
            });

            command = scan.nextLine();
        }

        Comparator<Map.Entry<String, Trainer>> orderDescByBadgesNum = (entry1, entry2) ->
                entry2.getValue().getBadgesNum() - entry1.getValue().getBadgesNum();

        trainers.entrySet().stream().sorted(orderDescByBadgesNum)
                .forEach((entry -> System.out.printf("%s %d %d\n",
                        entry.getKey(),
                        entry.getValue().getBadgesNum(),
                        entry.getValue().getPokemons().size())));
    }
}

//all trainers sorted by the amount of badges they have in descending order
// (if two trainers have the same amount of badges, they should be sorted
// by order of appearance in the input) in the format "{TrainerName} {Badges} {NumberOfPokemon}".