package ObjectsAndClasses._01_ObjectsAndClasses_Lab._05_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String input = scan.nextLine();
        while (!input.equals("end")){
            String[]studentData = input.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String hometown = studentData[3];
            Student currentStudent = new Student(firstName, lastName, age, hometown);
            studentList.add(currentStudent);
            input = scan.nextLine();
        }
        String town = scan.nextLine();
        for (Student student : studentList) {
            if (student.getHometown().equals(town)){
                System.out.println(student);
            }
        }
    }
}
