import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = user.length() - 1; i >= 0; i--) {
            char currentSymbol = user.charAt(i);
            passwordBuilder.append(currentSymbol);
        }
        String password = passwordBuilder.toString();
        String input = scan.nextLine();
        int count = 0;
        while (!input.equals(password)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", user);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            input = scan.nextLine();
        }
        System.out.printf("User %s logged in.", user);
    }
}
