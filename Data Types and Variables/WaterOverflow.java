package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //255 litres
        int n = Integer.parseInt(scan.nextLine());
        int sumOfLitres = 0;
        for (int i = 0; i < n; i++) {
            int litresOfWater = Integer.parseInt(scan.nextLine());
            if (litresOfWater + sumOfLitres > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                sumOfLitres += litresOfWater;
            }
        }
        System.out.println(sumOfLitres);
    }
}
