package technoStudy.Day35._05_periodAndDuration.duration;

import java.time.Duration;
import java.time.LocalTime;

public class DeterminingDuration {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime twoHoursFromNow = now.plusHours(2).minusMinutes(10);

        Duration between = Duration.between(now, twoHoursFromNow);
        System.out.println(between);

        System.out.println(now.plus(between));

        Duration threeHundredSecond = Duration.ofSeconds(300);
        System.out.println(now.plus(threeHundredSecond));
    }
}
