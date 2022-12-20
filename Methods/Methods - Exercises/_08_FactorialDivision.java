package Methods_Exercises;

import java.util.Scanner;

public class _08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Math.abs(Integer.parseInt(scan.nextLine()));
        int secondNumber = Math.abs(Integer.parseInt(scan.nextLine()));
        double firstFact = numberFactorial(firstNumber);
        double secondFact = numberFactorial(secondNumber);

        System.out.printf("%.2f", firstFact / secondFact);
    }

    private static double numberFactorial(int number) {
        double first = 1;
        for (int i = 1; i <= number; i++) {
            first *= i;
        }
        return first;
    }
}
