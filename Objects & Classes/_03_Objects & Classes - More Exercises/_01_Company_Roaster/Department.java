package ObjectsAndClasses._03_ObjectsAndClasses_More_Exercises._01_Company_Roaster;

import java.util.List;

public class Department {
    private String name;
    private double salary;
    private int count;

    public Department(String name, double salary, int count) {
        this.name = name;
        this.salary = salary;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
