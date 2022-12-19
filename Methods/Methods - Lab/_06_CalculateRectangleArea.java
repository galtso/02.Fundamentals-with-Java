package Methods_Lab;

import java.util.Scanner;

public class _06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        System.out.printf("%.0f",getRectangleArea(width, length));
    }

    private static double getRectangleArea(double width, double length) {
        return width * length;
    }
}
