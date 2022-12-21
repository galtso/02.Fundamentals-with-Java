package ObjectsAndClasses._01_ObjectsAndClasses_Lab;

import java.util.Random;
import java.util.Scanner;

public class _01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] initialWords = scan.nextLine().split(" ");
        Random randomIndex = new Random();
        for (int i = 0; i < initialWords.length; i++) {
            int newIndex = randomIndex.nextInt(initialWords.length);
            String currentWord = initialWords[i];
            initialWords[i] = initialWords[newIndex];
            initialWords[newIndex] = currentWord;
        }
        for (String word : initialWords) {
            System.out.println(String.join(" ", word));
        }
    }
}
