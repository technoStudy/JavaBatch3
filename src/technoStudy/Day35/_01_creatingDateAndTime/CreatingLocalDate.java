package technoStudy.Day35._01_creatingDateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class CreatingLocalDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate electionDay = LocalDate.of(2020, 11, 3);
        System.out.println(electionDay);

        LocalDate foolsDay = LocalDate.of(2020, Month.APRIL, 1);
        System.out.println(foolsDay);

        LocalDate programmersDay = LocalDate.ofYearDay(2020, 256);
        System.out.println(programmersDay);
    }
}
