import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scan.nextLine());
        double moneySpend = 0;
        String command = scan.nextLine();
        while (!command.equals("Game Time")) {
            switch (command) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if (currentBalance >= 39.99) {
                        System.out.println("Bought " + command);
                        currentBalance -= 39.99;
                        moneySpend += 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (currentBalance >= 15.99) {
                        System.out.println("Bought " + command);
                        currentBalance -= 15.99;
                        moneySpend += 15.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (currentBalance >= 19.99) {
                        System.out.println("Bought " + command);
                        currentBalance -= 19.99;
                        moneySpend += 19.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (currentBalance >= 59.99) {
                        System.out.println("Bought " + command);
                        currentBalance -= 59.99;
                        moneySpend += 59.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (currentBalance >= 29.99) {
                        System.out.println("Bought " + command);
                        currentBalance -= 29.99;
                        moneySpend += 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                return;
            }
            command = scan.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneySpend, currentBalance);
    }
}
