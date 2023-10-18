package Advanced.ExamPreparation;

import java.util.*;

public class FoodFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> vowelQueue = new ArrayDeque<>();
        ArrayDeque<String> consonantStack = new ArrayDeque<>();

        ArrayList<String> pear = new ArrayList<>(Arrays.asList("p", "e", "a", "r"));
        ArrayList<String> flour = new ArrayList<>(Arrays.asList("f", "l", "o", "u", "r"));
        ArrayList<String> pork = new ArrayList<>(Arrays.asList("p", "o", "r", "k"));
        ArrayList<String> olive = new ArrayList<>(Arrays.asList("o", "l", "i", "v", "e"));

        int wordsFoundCount = 0;

        Arrays.stream(scan.nextLine().split("\\s+")).forEach(vowelQueue::offer);
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(consonantStack::push);

        while (!consonantStack.isEmpty()) {
            String curVowel = vowelQueue.poll();
            String curConsonant = consonantStack.pop();

            pear.remove(curConsonant);
            pear.remove(curVowel);
            flour.remove(curConsonant);
            flour.remove(curVowel);
            pork.remove(curConsonant);
            pork.remove(curVowel);
            olive.remove(curConsonant);
            olive.remove(curVowel);

            vowelQueue.offer(curVowel);
        }

        ArrayList<String> wordsFound = new ArrayList<>();

        if (pear.isEmpty()) {
            wordsFoundCount ++;
            wordsFound.add("pear");
        }

        if (flour.isEmpty()) {
            wordsFoundCount ++;
            wordsFound.add("flour");
        }

        if (pork.isEmpty()) {
            wordsFoundCount ++;
            wordsFound.add("pork");
        }

        if (olive.isEmpty()) {
            wordsFoundCount ++;
            wordsFound.add("olive");
        }

        System.out.println("Words found: " + wordsFoundCount);
        wordsFound.forEach(System.out::println);
    }
}