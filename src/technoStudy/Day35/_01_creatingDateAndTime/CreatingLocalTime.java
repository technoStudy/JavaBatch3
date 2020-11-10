package technoStudy.Day35._01_creatingDateAndTime;

import java.time.LocalTime;

public class CreatingLocalTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime time = LocalTime.of(19, 30);
        System.out.println(time);

        LocalTime time1 = LocalTime.of(19, 30, 33);
        System.out.println(time1);
    }
}
