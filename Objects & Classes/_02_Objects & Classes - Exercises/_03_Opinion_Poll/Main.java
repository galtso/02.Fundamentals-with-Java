package ObjectsAndClasses._02_ObjectsAndClasses_Exercises._03_Opinion_Poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[]personData = scan.nextLine().split(" ");
            String personName = personData[0];
            int personAge = Integer.parseInt(personData[1]);
            personList.add(new Person(personName, personAge));
        }
        for (Person person : personList) {
            if (person.getAge() > 30) {
                System.out.println(person);
            }
        }
    }
}
