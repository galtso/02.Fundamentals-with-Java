package BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        if (minutes + 30 > 59) {
            hour++;
            minutes = (minutes + 30) - 60;
            if (hour > 23) {
                hour -= 24;
            }
        } else {
            minutes = minutes + 30;
        }
        System.out.printf("%d:%02d",hour,minutes);
    }
}
