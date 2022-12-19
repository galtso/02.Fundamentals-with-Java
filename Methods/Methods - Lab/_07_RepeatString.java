package Methods_Lab;

import java.util.Scanner;

public class _07_RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputText = scan.nextLine();
        int repetitions = Integer.parseInt(scan.nextLine());
        System.out.println(getRepeatedString(inputText, repetitions));
    }

    private static String getRepeatedString(String inputText, int repetitions) {
        String result = "";
        for (int i = 0; i < repetitions; i++) {
            result+=inputText;
        }
        return result;
    }
}
