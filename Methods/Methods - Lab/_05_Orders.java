package Methods_Lab;

import java.util.Scanner;

public class _05_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        double price;
        switch (product) {
            case "coffee":
                price = 1.5;
                printTheSum(quantity, price);
                break;
            case "water":
                price = 1;
                printTheSum(quantity, price);
                break;
            case "coke":
                price = 1.4;
                printTheSum(quantity, price);
                break;
            case "snacks":
                price = 2;
                printTheSum(quantity, price);
                break;
        }
    }

    public static void printTheSum(int quantity, double price) {
        System.out.printf("%.2f", quantity * price);
    }
}
