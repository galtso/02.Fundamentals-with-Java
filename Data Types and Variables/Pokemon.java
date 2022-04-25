package DataTypesAndVariables;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int originalPower = Integer.parseInt(scan.nextLine());
        int powerLeft = originalPower;
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustion = Integer.parseInt(scan.nextLine());
        int pokedTargets = 0;
        while (powerLeft >= distance) {
            powerLeft -= distance;
            pokedTargets++;
            if (1.0 * originalPower / 2 == powerLeft) {
                if (exhaustion != 0) {
                    powerLeft /= exhaustion;
                }else {
                    continue;
                }
            }
        }
        System.out.println(powerLeft);
        System.out.println(pokedTargets);
    }
}
