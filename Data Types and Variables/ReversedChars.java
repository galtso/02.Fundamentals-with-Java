import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstChar = scan.nextLine();
        String secondChar = scan.nextLine();
        String thirdChar = scan.nextLine();
        System.out.printf("%s %s %s", thirdChar, secondChar, firstChar);
    }
}
