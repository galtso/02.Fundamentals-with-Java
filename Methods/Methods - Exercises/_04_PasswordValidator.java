package Methods_Exercises;

import java.util.Scanner;

public class _04_PasswordValidator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if (!checkForLength(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!onlyDigitsAndLetters(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!checkForLeastTwoDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }
        if (checkForLength(password) && onlyDigitsAndLetters(password) && checkForLeastTwoDigits(password)){
            System.out.println("Password is valid");
        }
    }

    private static boolean checkForLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean onlyDigitsAndLetters(String pass) {
        return pass.matches("[A-Za-z0-9]*");
    }

    private static boolean checkForLeastTwoDigits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                count++;
            }
        }
        return count >= 2;
    }
}
