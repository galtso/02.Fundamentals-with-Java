package ObjectsAndClasses._02_ObjectsAndClasses_Exercises._01_Advertisement_Message;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            printRandomMessage();
        }
    }

    private static void printRandomMessage() {
        String[] phrases = new String[]{"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        String randomPhrase = generateRandomElement(phrases);
        String randomEvent = generateRandomElement(events);
        String randomAuthor = generateRandomElement(authors);
        String randomCity = generateRandomElement(cities);
        System.out.printf("%s %s %s – %s%n", randomPhrase, randomEvent, randomAuthor, randomCity);

    }

    private static String generateRandomElement(String[] array) {
        Random randomPhrase = new Random();
        int randomInt = randomPhrase.nextInt(array.length);
        return array[randomInt];
    }
}
