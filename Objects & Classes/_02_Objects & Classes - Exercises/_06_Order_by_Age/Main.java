package ObjectsAndClasses._02_ObjectsAndClasses_Exercises._06_Order_by_Age;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Person> personList = new ArrayList<>();
        while (!input.equals("End")) {
            String[] personData = input.split(" ");
            String name = personData[0];
            String id = personData[1];
            int age = Integer.parseInt(personData[2]);
            personList.add(new Person(name, id, age));
            input = scan.nextLine();
        }
        personList = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
