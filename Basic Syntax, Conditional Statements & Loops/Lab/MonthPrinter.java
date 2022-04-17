package BasicSyntaxConditionalStatementsLoopsLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        Map<Integer, String> monthMap = new LinkedHashMap<>();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 1; i <= 12; i++) {
            monthMap.put(i, months[i - 1]);
        }
        if (number > 0 && number <= 12) {
            System.out.println(monthMap.get(number));
        } else {
            System.out.println("Error!");
        }
    }
}
