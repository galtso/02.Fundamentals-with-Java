import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int startingIndex = Integer.parseInt(scan.nextLine());
        if (startingIndex > 10) {
            System.out.printf("%d X %d = %d%n", number, startingIndex, number * startingIndex);
        } else {
            for (int i = startingIndex; i <= 10; i++) {
                int product = number * i;
                System.out.printf("%d X %d = %d%n", number, i, product);
            }
        }

    }
}

