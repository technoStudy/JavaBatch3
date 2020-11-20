package technoStudy.Day41.inheritance;

public class SDET extends Employee {
    double bonus;
    double salary; // if you define field with the same name,
    // now SDET class will have two fields
    // parent field can be accessed using super
    // his own field can be accessed using this


    public SDET(double superSalary, double bonus, double sdetSalary) {
        super(superSalary);
        this.bonus = bonus;
        this.salary = sdetSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary(){
        return this.salary;
    }

    public double getSuperSalary(){
        return super.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setSuperSalary(double salary){
        super.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public double superCalculateSalary(){
        return super.calculateSalary();
    }
}
