package technoStudy.Day41.inheritance;

public class Demo3This {
    public static void main(String[] args) {
        SDET sdetEmployee = new SDET();

        sdetEmployee.setSalary(120000);
        sdetEmployee.setSuperSalary(100000);
        System.out.println(sdetEmployee.calculateSalary());
        System.out.println(sdetEmployee.superCalculateSalary());
    }
}
