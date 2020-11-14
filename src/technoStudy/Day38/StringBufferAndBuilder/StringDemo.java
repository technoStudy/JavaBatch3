package technoStudy.Day38.StringBufferAndBuilder;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        LocalTime time1 = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            str = str.concat("hello"); // new object every time
        }
        LocalTime time2 = LocalTime.now();
        System.out.println(Duration.between(time1, time2));
        System.out.println(str);
    }
}
