import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int number = Integer.parseInt(scan.nextLine());
            numbers.add(number);
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
