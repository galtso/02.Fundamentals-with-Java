import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double totalPrice = 0;
        for (int i = 0; i < n; i++) {
            double price = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int count = Integer.parseInt(scan.nextLine());
            System.out.printf("The price for the coffee is: $%.2f%n", ((count * days) * price));
            totalPrice += ((count * days) * price);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
