package technoStudy.Day42.hiding;

import java.time.LocalDate;

public class Child extends Parent {
    public static int calculateAge(LocalDate dob){
        return 1;
    }

    @Override
    public int instanceMethod(){
        System.out.println("Child instance method");
        return 1;
    }
}
