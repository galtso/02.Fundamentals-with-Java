package Methods_Exercises;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= number; i++) {
            if (divisibleBy8(i) && oneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean divisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    private static boolean oneOddDigit(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
