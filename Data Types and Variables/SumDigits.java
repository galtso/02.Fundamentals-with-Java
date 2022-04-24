package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int sumOfDigits = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            sumOfDigits += currentDigit;
            number /= 10;
        }
        System.out.println(sumOfDigits);
    }
}
