package Methods_Exercises;

import java.util.Scanner;

public class _09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            int reversed = reversedNumber(number);
            if (number == reversed) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scan.nextLine();
        }
    }

    private static int reversedNumber(int a) {
        int reversed = 0;
        while (a > 0) {
            reversed = reversed * 10 + a % 10;
            a /= 10;
        }
        return reversed;
    }
}
