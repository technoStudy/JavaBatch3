package technoStudy.Day36;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate afterOneDecade = now.plus(2, ChronoUnit.DECADES);

        System.out.println(afterOneDecade);

        long between = ChronoUnit.DAYS.between(now, afterOneDecade);
        System.out.println(between);
    }
}
