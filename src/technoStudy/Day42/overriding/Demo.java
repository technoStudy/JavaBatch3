package technoStudy.Day42.overriding;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        Child child = new Child();
        child.calculateAge(LocalDate.now());

    }
}
