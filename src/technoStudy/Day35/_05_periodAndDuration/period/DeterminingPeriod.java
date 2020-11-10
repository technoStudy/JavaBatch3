package technoStudy.Day35._05_periodAndDuration.period;

import java.time.LocalDate;
import java.time.Period;

public class DeterminingPeriod {
    public static void main(String[] args) {
        LocalDate previousElection = LocalDate.of(2016, 11, 3);
        LocalDate now = LocalDate.now();

        Period between = Period.between(now, previousElection);
        System.out.println(between);

        between = Period.between(previousElection, now);
        System.out.println(between);

        LocalDate after4years7days = now.plus(between);
        System.out.println(after4years7days);

        Period sixWeeks = Period.ofWeeks(6);
        LocalDate afterSixWeeks = now.plus(sixWeeks);
        System.out.println(afterSixWeeks);
    }
}
