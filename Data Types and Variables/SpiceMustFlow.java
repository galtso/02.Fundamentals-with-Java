package DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingYield = Integer.parseInt(scan.nextLine());
        int minedSpice = 0;
        int countDays = 0;
        while (startingYield >= 100) {
            minedSpice += startingYield;
            countDays++;
            if (minedSpice >= 26) {
                minedSpice -= 26;
            }
            startingYield -= 10;
        }
        if (minedSpice >= 26) {
            minedSpice -= 26;
        }
        System.out.println(countDays);
        System.out.println(minedSpice);
    }
}
