package DataTypesAndVariables;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("END")) {
            Scanner scan2 = new Scanner(input);
            if (scan2.hasNextInt()) {
                System.out.println(input + " is integer type");
            } else if (scan2.hasNextFloat()) {
                System.out.println(input + " is floating point type");
            } else if (scan2.hasNextBoolean()) {
                System.out.println(input + " is boolean type");
            } else if (input.length() == 1) {
                System.out.println(input + " is character type");
            } else if (scan2.hasNextLine()) {
                System.out.println(input + " is string type");
            }
            input = scan.nextLine();
        }
    }
}
