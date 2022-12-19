package Methods_Lab;

import java.util.Scanner;

public class _10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber = Math.abs(Integer.parseInt(scan.nextLine()));
        System.out.println(multiplyEvensAndOdds(inputNumber));
    }

    private static int multiplyEvensAndOdds(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);
        return evenSum * oddSum;
    }

    private static int getEvenSum(int number) {
        int sum = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                sum += currentDigit;
            }
            number /= 10;
        }
        return sum;
    }

    private static int getOddSum(int number) {
        int sum = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 != 0) {
                sum += currentDigit;
            }
            number /= 10;
        }
        return sum;
    }
}
