package ObjectsAndClasses._02_ObjectsAndClasses_Exercises._04_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[]studentInfo = scan.nextLine().split(" ");
            String fName = studentInfo[0];
            String lName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);
            studentList.add(new Student(fName, lName, grade));
        }
        studentList = studentList.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
