package Methods_Lab;
import java.util.Scanner;
public class _02_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gradeInput = Double.parseDouble(scan.nextLine());
        printGradeInWords(gradeInput);
    }
    public static void printGradeInWords(double grade) {
        if (grade >= 2 && grade < 3) {
            System.out.println("Fail");
        } else if (grade < 3.5) {
            System.out.println("Poor");
        } else if (grade < 4.5) {
            System.out.println("Good");
        } else if (grade < 5.5) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
