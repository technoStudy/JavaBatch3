package technoStudy.Day41.inheritance;

public class Employee {
    protected double salary;


    public Employee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}
