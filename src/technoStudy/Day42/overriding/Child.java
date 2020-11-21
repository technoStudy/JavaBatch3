package technoStudy.Day42.overriding;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Child extends Parent {
    @Override
    public int calculateAge(LocalDate dob){
        return 1;
    }
}
