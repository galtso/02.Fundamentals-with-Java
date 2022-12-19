package Methods_Exercises;

import java.util.Scanner;

public class _03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        System.out.println(getTheCharsBetween(first, second));
    }

    private static String getTheCharsBetween(char first, char second) {
        String result = "";
        for (int i = Math.min(first, second)+1; i < Math.max(first, second); i++) {
            result += ((char)(i) + " ");
        }
        return result;
    }
}
