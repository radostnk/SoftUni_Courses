package E_FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> guestsList = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("Party!")) {
            String[] commandParts = command.split("\\s+");
            String doubleOrRemove = commandParts[0];

            if (doubleOrRemove.equals("Remove")) {
                guestsList.removeIf(getPredicate(commandParts));

            } else if (doubleOrRemove.equals("Double")) {
                List<String> doubledGuests = new ArrayList<>();
                guestsList.stream().filter(getPredicate(commandParts)).forEach(doubledGuests::add);
                guestsList.addAll(doubledGuests);
            }

            command = scan.nextLine();
        }

        if (guestsList.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guestsList);
            System.out.println(String.join(", ", guestsList) + " are going to the party!");;
        }
    }

    public static Predicate<String> getPredicate(String[] commandParts) {
        String condition = commandParts[1];
        String value = commandParts[2];
        Predicate<String> predicate = null;

        switch (condition) {
            case "StartsWith":
                predicate = e -> e.startsWith(value);
                break;

            case "EndsWith":
                predicate = e -> e.endsWith(value);
                break;

            case "Length":
                predicate = e -> e.length() == Integer.parseInt(value);
                break;
        }

        return predicate;
    }
}
