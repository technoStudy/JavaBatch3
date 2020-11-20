package technoStudy.Day41.inheritance;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee(100000);
//        employee.bonus = 10000;
        System.out.println(employee.calculateSalary());

        SDET sdetEmployee = new SDET(0.0, 10000,120000);
//        sdetEmployee.salary = 120000;
//        sdetEmployee.bonus = 10000;
        System.out.println(sdetEmployee.calculateSalary());
    }
}
