package Methods_Lab;
import java.util.Scanner;
public class _03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scan.nextLine());
        printingTriangle(inputNumber);
    }
    public static void printingTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            printingLine(i);
        }
        for (int i = number - 1; i > 0; i--) {
            printingLine(i);
        }
    }
    public static void printingLine(int lineNumber) {
        for (int i = 1; i <= lineNumber; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
