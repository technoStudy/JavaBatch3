package technoStudy.Day41.superConstructor.ver3;

public class Employee {
    public Employee(String message){ // args constructor
        System.out.println("constructor with arguments: " + message);
    }

    public Employee(int number){
        System.out.println("Another consturctor");
    }
}
