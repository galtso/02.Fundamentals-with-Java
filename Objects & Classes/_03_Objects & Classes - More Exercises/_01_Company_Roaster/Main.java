package ObjectsAndClasses._03_ObjectsAndClasses_More_Exercises._01_Company_Roaster;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] employeeData = scan.nextLine().split(" ");
            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String department = employeeData[3];
            String email = "n/a";
            int age = -1;

            if (employeeData.length == 6){
                email = employeeData[4];
                age = Integer.parseInt(employeeData[5]);
            }else if (employeeData.length ==5){
                if (employeeData[4].contains("@")){
                    email = employeeData[4];
                }else {
                    age = Integer.parseInt(employeeData[4]);
                }
            }
            Employee currentEmployee = new Employee(name, salary, position, department, email, age);
            employeeList.add(currentEmployee);

            Department currentDepartment = departmentList.stream().filter(s -> s.getName().equals(department)).findFirst().orElse(null);
            if (currentDepartment == null){
                Department newDepartment = new Department(department, salary, 1);
                departmentList.add(newDepartment);
            }else {
                currentDepartment.setSalary(currentDepartment.getSalary() + salary);
                currentDepartment.setCount(currentDepartment.getCount() + 1);
            }
        }
        String highSalaryDep = getHighAverageSalaryDepartment(departmentList);
        System.out.printf("Highest Average Salary: %s%n",highSalaryDep);
        employeeList
                .stream()
                .filter(s -> s.getDepartment().equals(highSalaryDep))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList())
                .forEach(s -> System.out.printf("%s %.2f %s %d%n", s.getName(), s.getSalary(), s.getEmail(), s.getAge()));


    }

        private static String getHighAverageSalaryDepartment(List<Department> list) {
            double highAverageSalary = 0;
            String departmentToReturn = "";
            for (Department department : list) {
                double averageSalary = department.getSalary() / department.getCount();
                if (averageSalary > highAverageSalary){
                    highAverageSalary = averageSalary;
                    departmentToReturn = department.getName();
                }
            }
            return departmentToReturn;
    }
}
