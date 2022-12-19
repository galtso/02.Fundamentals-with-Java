package Methods_Exercises;

import java.util.Scanner;

public class _01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());
        System.out.println(getTheMinNumber(firstNumber, secondNumber, thirdNumber));
    }

    private static int getTheMinNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            return firstNumber;
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
