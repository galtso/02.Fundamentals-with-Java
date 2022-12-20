package Methods_Exercises;

import java.util.Scanner;

public class _05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int sum = sumOfTwoInteger(first, second);
        System.out.println(subtractOfTwoIntegers(sum, third));
    }

    private static int sumOfTwoInteger(int a, int b) {
        return a + b;
    }
    private static int subtractOfTwoIntegers(int a, int b){
        return a - b;
    }
}
