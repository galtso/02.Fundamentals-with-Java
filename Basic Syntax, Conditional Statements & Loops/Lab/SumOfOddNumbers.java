import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            sum += oddNumber;
            System.out.println(oddNumber);
        }
        System.out.printf("Sum: %d", sum);
    }
}
