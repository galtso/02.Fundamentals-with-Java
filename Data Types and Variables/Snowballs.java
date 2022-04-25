package DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double bestValue = Double.MIN_VALUE;
        int bestSnow = Integer.MIN_VALUE;
        int bestTime = Integer.MIN_VALUE;
        int bestQuality = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int theSnow = Integer.parseInt(scan.nextLine());
            int theTime = Integer.parseInt(scan.nextLine());
            int theQuality = Integer.parseInt(scan.nextLine());
            double theValue = Math.pow(1.0 * theSnow / theTime, theQuality);
            if (theValue > bestValue) {
                bestValue = theValue;
                bestSnow = theSnow;
                bestTime = theTime;
                bestQuality = theQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
