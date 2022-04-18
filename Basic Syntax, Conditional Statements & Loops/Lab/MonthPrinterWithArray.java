package BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class MonthPrinterWithArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (number > 0 && number < 13) {
            System.out.println(months[number - 1]);
        } else {
            System.out.println("Error!");
        }
    }
}
