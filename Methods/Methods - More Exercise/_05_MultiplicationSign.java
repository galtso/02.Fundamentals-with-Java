package Methods_More_Exercises;

import java.util.Scanner;

public class _05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int[] arr = new int[]{num1, num2, num3};
        System.out.println(signOfArrayMultiplication(arr));
    }

    private static String signOfArrayMultiplication(int[] arr) {
        int minusSign = 0;
        for (int j : arr) {
            if (j == 0) {
                return "zero";
            } else if (j < 0) {
                minusSign++;
            }
        }
        if (minusSign % 2 == 0) {
            return "positive";
        }
        return "negative";
    }


}
