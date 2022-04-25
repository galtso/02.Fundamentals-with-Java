package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String biggestKeg = "";
        double maxVolume = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String model = scan.nextLine();
            double kegRadius = Double.parseDouble(scan.nextLine());
            int kegHeight = Integer.parseInt(scan.nextLine());
            double kegVolume = Math.PI * kegRadius * kegRadius * kegHeight;
            if (kegVolume > maxVolume) {
                maxVolume = kegVolume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
