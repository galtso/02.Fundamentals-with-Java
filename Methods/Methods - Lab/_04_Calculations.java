package Methods_Lab;
import java.util.Scanner;
public class _04_Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int firstInput = Integer.parseInt(scan.nextLine());
        int secondInput = Integer.parseInt(scan.nextLine());
        switch (command) {
            case "add":
                addCommand(firstInput, secondInput);
                break;
            case "multiply":
                multiplyCommand(firstInput, secondInput);
                break;
            case "subtract":
                subtractCommand(firstInput, secondInput);
                break;
            case "divide":
                divideCommand(firstInput, secondInput);
                break;
        }
    }
    public static void multiplyCommand(int first, int second) {
        System.out.println(first * second);
    }
    public static void addCommand(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
    public static void subtractCommand(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }
    public static void divideCommand(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }
}
