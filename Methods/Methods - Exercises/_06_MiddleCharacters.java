package Methods_Exercises;

import java.util.Scanner;

public class _06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.length() % 2 != 0) {
            System.out.println(getMiddleChar(input));
        } else {
            System.out.println(getMiddleTwoChars(input));
        }
    }

    private static char getMiddleChar(String text) {
        return text.charAt(text.length() / 2);
    }

    private static String getMiddleTwoChars(String text) {
        return "" + text.charAt(text.length() / 2 - 1) + text.charAt(text.length() / 2);
    }
}
