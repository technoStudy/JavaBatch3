package technoStudy.Day42.hiding;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.calculateAge(LocalDate.now()));

        Child child = new Child();
        System.out.println(child.calculateAge(LocalDate.now()));

        Parent parentThatIsAChildInside = new Child(); // polymorphism
        System.out.println(parentThatIsAChildInside.calculateAge(LocalDate.now())); // hiding

        System.out.println(parentThatIsAChildInside.instanceMethod()); // overriding
    }
}
