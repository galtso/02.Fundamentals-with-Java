package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());
        System.out.printf("%.0f", Math.ceil(1.0 * people / capacity));
    }
}
