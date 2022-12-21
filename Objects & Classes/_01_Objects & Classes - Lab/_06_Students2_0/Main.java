package ObjectsAndClasses._01_ObjectsAndClasses_Lab._06_Students2_0;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] studentData = input.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String hometown = studentData[3];

            if (isStudentExist(firstName, lastName, studentList)) {
                Student student = getExistingStudent(studentList, firstName, lastName);
                student.setAge(age);
                student.setHometown(hometown);
            } else {
                Student newStudent = new Student(firstName, lastName, age, hometown);
                studentList.add(newStudent);
            }
            input = scan.nextLine();
        }
        String city = scan.nextLine();
        for (Student student : studentList) {
            if (student.getHometown().equals(city)) {
                System.out.println(student);
            }
        }
    }

    private static Student getExistingStudent(List<Student> studentList, String firstName, String lastName) {
        Student existing = null;
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existing = student;
            }
        }
        return existing;
    }

    public static boolean isStudentExist(String fName, String lName, List<Student> students) {
        for (Student student : students) {
            if (student.getFirstName().equals(fName) && student.getLastName().equals(lName)) {
                return true;
            }
        }
        return false;
    }
}
