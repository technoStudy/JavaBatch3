package technoStudy.Day38.StringBufferAndBuilder;

import java.time.Duration;
import java.time.LocalTime;

public class Demo {
    public static void main(String[] args) {
        String str = "Hello";
        LocalTime time1 = LocalTime.now();
        int count = 1000000;
        for (int i = 0; i < count; i++) {
            str = str.concat("hello"); // new object every time
        }
        LocalTime time2 = LocalTime.now();
        System.out.println("String " + Duration.between(time1, time2));

        StringBuilder stringBuilder = new StringBuilder("Hello");
        time1 = LocalTime.now();
        for (int i = 0; i < count; i++) {
            stringBuilder.append("hello"); // does not create new object every time
        }
        time2 = LocalTime.now();
        System.out.println("StringBuilder " + Duration.between(time1, time2));

        StringBuffer stringBuffer = new StringBuffer("Hello");
        time1 = LocalTime.now();
        for (int i = 0; i < count; i++) {
            stringBuffer.append("hello"); // does not create new object every time
        }
        time2 = LocalTime.now();
        System.out.println("StringBuffer " + Duration.between(time1, time2));
    }
}
