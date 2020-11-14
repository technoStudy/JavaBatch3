package technoStudy.Day38.StringBufferAndBuilder;

import javafx.beans.binding.When;

import java.time.Duration;
import java.time.LocalTime;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        LocalTime time1 = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            str.append("hello"); // does not create new object every time
        }
        LocalTime time2 = LocalTime.now();
        System.out.println(Duration.between(time1, time2));
        System.out.println(str.toString());
    }
}
