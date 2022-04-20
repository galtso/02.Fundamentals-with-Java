import java.util.Scanner;

public class VendingMachine1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double sum = 0;
        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2) {
                System.out.printf("Cannot accept %.2f%n", coin);
            } else {
                sum += coin;
            }
            input = scan.nextLine();
        }
        String product = scan.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sum >= 2) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= 2;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= 1;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            product = scan.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}
