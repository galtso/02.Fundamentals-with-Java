import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int lastDigit = number % 10;
        String englishName = "";

        System.out.println(getEnglishName(lastDigit, englishName));
    }

    private static String getEnglishName(int lastDigit, String englishName) {
        switch (lastDigit) {
            case 0:
                englishName = "zero";
                break;
            case 1:
                englishName = "one";
                break;
            case 2:
                englishName = "two";
                break;
            case 3:
                englishName = "three";
                break;
            case 4:
                englishName = "four";
                break;
            case 5:
                englishName = "five";
                break;
            case 6:
                englishName = "six";
                break;
            case 7:
                englishName = "seven";
                break;
            case 8:
                englishName = "eight";
                break;
            case 9:
                englishName = "nine";
                break;
        }
        return englishName;
    }
}
