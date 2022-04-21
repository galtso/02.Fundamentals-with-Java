import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        double rageExpenses = 0;
        for (int i = 1; i <= lostGames; i++) {
            if (i % 12 == 0) {
                rageExpenses += displayPrice;
            }
            if (i % 6 == 0) {
                rageExpenses += keyboardPrice;
            }
            if (i % 3 == 0) {
                rageExpenses += mousePrice;
            }
            if (i % 2 == 0) {
                rageExpenses += headsetPrice;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
