package technoStudy.Day41.inheritance;

public class Demo2This {
    public static void main(String[] args) {
        SDET sdetEmployee = new SDET(100000, 0.0, 120000);
//
//        sdetEmployee.setSalary(120000);
//        sdetEmployee.setSuperSalary(100000);
        System.out.println(sdetEmployee.getSalary());
        System.out.println(sdetEmployee.getSuperSalary());
    }
}
