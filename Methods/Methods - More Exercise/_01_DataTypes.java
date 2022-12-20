package Methods_More_Exercises;

import java.util.Scanner;

public class _01_DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        switch (input) {
            case "int":
                int number = Integer.parseInt(scan.nextLine());
                printMultipliedDoubleNumber(number);
                break;
            case "real":
                double number2 = Double.parseDouble(scan.nextLine());
                printMultipliedDoubleNumber(number2);
                break;
            case "string":
                String inputText = scan.nextLine();
                System.out.println("$" + inputText + "$");
                break;
        }
    }

    private static void printMultipliedDoubleNumber(double number2) {
        System.out.printf("%.2f", number2 * 1.5);
    }

    private static void printMultipliedDoubleNumber(int number) {
        System.out.println(2 * number);
    }
}
