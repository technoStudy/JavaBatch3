package technoStudy.Day35._03_comparingDateAndTime;

import java.time.LocalTime;

public class ComparingTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime twoMinutesInFuture = now.plusMinutes(2);

        boolean after = now.isAfter(twoMinutesInFuture);
        boolean before = now.isBefore(twoMinutesInFuture);
        boolean equals = now.equals(twoMinutesInFuture);

        System.out.println(after);
        System.out.println(before);
        System.out.println(equals);

//        now.isLeapYear() // because there's no year info in LocalTime
    }
}
