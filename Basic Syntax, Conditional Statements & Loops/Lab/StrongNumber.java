import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
