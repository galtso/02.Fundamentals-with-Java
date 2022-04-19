import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        String typeOfGroup = scan.nextLine();
        String day = scan.nextLine();
        double sum = 0;
        if (typeOfGroup.equals("Business") && numberOfPeople >= 100) {
            numberOfPeople -= 10;
        }
        switch (day) {
            case "Friday":
                if (typeOfGroup.equals("Students")) {
                    sum = numberOfPeople * 8.45;
                } else if (typeOfGroup.equals("Business")) {
                    sum = numberOfPeople * 10.9;
                } else {
                    sum = numberOfPeople * 15;
                }
                break;
            case "Saturday":
                if (typeOfGroup.equals("Students")) {
                    sum = numberOfPeople * 9.8;
                } else if (typeOfGroup.equals("Business")) {
                    sum = numberOfPeople * 15.6;
                } else {
                    sum = numberOfPeople * 20;
                }
                break;
            case "Sunday":
                if (typeOfGroup.equals("Students")) {
                    sum = numberOfPeople * 10.46;
                } else if (typeOfGroup.equals("Business")) {
                    sum = numberOfPeople * 16;
                } else {
                    sum = numberOfPeople * 22.5;
                }
                break;
        }
        if (typeOfGroup.equals("Students") && numberOfPeople >= 30) {
            sum *= 0.85;
        }
        if (typeOfGroup.equals("Regular") && (numberOfPeople >= 10 && numberOfPeople <= 20)) {
            sum *= 0.95;
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
