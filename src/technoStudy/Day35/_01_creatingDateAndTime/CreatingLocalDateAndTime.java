package technoStudy.Day35._01_creatingDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreatingLocalDateAndTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime dateTime = LocalDateTime.of(2020, 1, 15, 12, 0, 15);
        System.out.println(dateTime);

        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.of(currentDate, currentTime);
        System.out.println(currentDateTime);
    }
}
