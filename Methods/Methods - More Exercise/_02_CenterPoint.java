package Methods_More_Exercises;

import java.util.Scanner;

public class _02_CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());
        if (calculateDistance(x1, y1) <= calculateDistance(x2, y2)) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }

    private static double calculateDistance(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
