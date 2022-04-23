import java.util.Scanner;

public class ConvertMetresToKilometres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int metres = Integer.parseInt(scan.nextLine());
        double kilometres = 1.0 * metres / 1000;
        System.out.printf("%.2f", kilometres);
    }
}
