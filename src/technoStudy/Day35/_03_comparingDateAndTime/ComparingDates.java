package technoStudy.Day35._03_comparingDateAndTime;

import java.time.LocalDate;

public class ComparingDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);

        boolean after = date.isAfter(yesterday);
        boolean before = date.isBefore(yesterday);
        boolean equal = date.isEqual(yesterday);

        System.out.println(after);
        System.out.println(before);
        System.out.println(equal);

        boolean leapYear = date.isLeapYear();
        System.out.println(leapYear);
    }
}
