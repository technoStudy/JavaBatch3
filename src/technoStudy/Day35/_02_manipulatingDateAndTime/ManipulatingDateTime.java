package technoStudy.Day35._02_manipulatingDateAndTime;

import java.time.LocalDateTime;

public class ManipulatingDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.plusWeeks(6).minusHours(2);
        System.out.println(localDateTime);
    }
}
