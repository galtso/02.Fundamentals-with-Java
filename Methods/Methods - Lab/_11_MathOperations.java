package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scan.nextLine());
        String operator = scan.nextLine();
        double secondNumber = Double.parseDouble(scan.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");
        switch (operator) {
            case "+":
                System.out.println(df.format(calculateSum(firstNumber, secondNumber)));
                break;
            case "-":
                System.out.println(df.format(calculateSubtract(firstNumber, secondNumber)));
                break;
            case "*":
                System.out.println(df.format(calculateMultiply(firstNumber, secondNumber)));
                break;
            case "/":
                System.out.println(df.format(calculateDivide(firstNumber, secondNumber)));
                break;
        }
    }

    private static double calculateSum(double a, double b) {
        return a + b;
    }

    private static double calculateSubtract(double a, double b) {
        return a - b;
    }

    private static double calculateMultiply(double a, double b) {
        return a * b;
    }

    private static double calculateDivide(double a, double b) {
        return a / b;
    }
}
