package E_Arrays;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] loot = input.split("\\|");


        while(true){
            String [] commandArray = scanner.nextLine().split(("\\s"));
            if(commandArray[0].equals("Loot")){
                int trueSize = 0;
                int entries = 0;
                int backstop = 0;
                for (int i = 0; i < loot.length; i++) {
                    for (int j = 1; j < commandArray.length; j++) {
                        if(loot[i].equals(commandArray[j])){
                            commandArray[j] = " ";
                            trueSize++;
                        }
                    }

                }
                String [] tempArray = new String[loot.length + commandArray.length-1-trueSize];
                for (int i = commandArray.length-1; i > 0; i--) {
                    if(!commandArray[i].equals(" ")) {
                        tempArray[backstop] = commandArray[i];
                        backstop++;
                        entries++;
                    }
                }
                System.arraycopy(loot, 0, tempArray, entries, loot.length);
                loot = tempArray;
            }else if(commandArray[0].equals("Drop")){
                if(Integer.parseInt(commandArray[1])>-1&&Integer.parseInt(commandArray[1])< loot.length-1) {
                    String tempElement = loot[Integer.parseInt(commandArray[1])];
                    for (int i = Integer.parseInt(commandArray[1]); i < loot.length-1; i++) {
                        loot[i] = loot[i+1];
                    }
                    loot[loot.length-1] = tempElement;
                }
            }else if(commandArray[0].equals("Steal")){
                if(Integer.parseInt(commandArray[1])< loot.length){
                    String [] tempArray2 = new String[loot.length-Integer.parseInt(commandArray[1])];
                    for (int i = loot.length-Integer.parseInt(commandArray[1]);i< loot.length; i++) {
                        if(i< loot.length-1){
                            System.out.print(loot[i] + ", "); }
                        else {
                            System.out.print(loot[i] + "\n");
                        }
                    }
                    for (int i = 0; i < tempArray2.length; i++) {
                        tempArray2[i] = loot[i];
                    }
                    loot = tempArray2;
                } else {
                    String [] tempArray3 = new String[0];
                    System.out.println(String.join(", ", loot));
                    loot = tempArray3;
                }
            }else {
                break;
            }
        }
        double score = 0;
        if(loot.length!=0) {
            for (int i = 0; i < loot.length; i++) {
                score += loot[i].length();
            }
            score /= loot.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", score);
        } else {
            System.out.print("Failed treasure hunt.");
        }
    }
}