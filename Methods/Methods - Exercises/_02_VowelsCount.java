package Methods_Exercises;

import java.util.Scanner;

public class _02_VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(getTheVowelsCount(input));
    }

    private static int getTheVowelsCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.toLowerCase().charAt(i);
            if (currentSymbol == 97 ||
                    currentSymbol == 101 ||
                    currentSymbol == 105 ||
                    currentSymbol == 111 ||
                    currentSymbol == 117 ||
                    currentSymbol == 121) {
                count++;
            }
        }
        return count;
    }
}
