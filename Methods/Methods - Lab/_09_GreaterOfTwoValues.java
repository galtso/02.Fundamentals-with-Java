package Methods_Lab;

import java.util.Scanner;

public class _09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputType = scan.nextLine();
        switch (inputType){
            case "int":
                int firstNumber = Integer.parseInt(scan.nextLine());
                int secondNumber = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char":
                char firstChar = scan.nextLine().charAt(0);
                char secondChar = scan.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String text1 = scan.nextLine();
                String text2 = scan.nextLine();
                System.out.println(getMax(text1, text2));
                break;
        }
    }
    private static int getMax(int n1, int n2){
        if (n1 > n2){
            return n1;
        }
        return n2;
    }
    private static char getMax(char s1, char s2){
        if (s1 > s2){
            return s1;
        }
        return s2;
    }
    private static String getMax(String first, String second){
        if (first.compareTo(second) > 0){
            return first;
        }
        return second;
    }
}
