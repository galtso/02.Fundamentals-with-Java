package DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.charAt(0) >= 65 && input.charAt(0) <= 90) {
            System.out.println("upper-case");
        } else if (input.charAt(0) >= 97 && input.charAt(0) <= 122) {
            System.out.println("lower-case");
        }
    }
}
