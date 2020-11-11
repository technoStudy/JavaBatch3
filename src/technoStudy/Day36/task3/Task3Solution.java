package technoStudy.Day36.task3;

import technoStudy.Day36.task2.Task2Solution;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task3Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date1 = null;
        do {
            System.out.println("Input date:");
            String userInput = scanner.nextLine();
            date1 = Task2Solution.convertToDate(userInput);
        } while (date1 == null);

        LocalDate date2 = null;
        do {
            System.out.println("Input date:");
            String userInput = scanner.nextLine();
            date2 = Task2Solution.convertToDate(userInput);
        } while (date2 == null);

        Long dayDifference = getDayDifference(date1, date2);

        System.out.println("The day difference is " + dayDifference);
    }

    public static Long getDayDifference(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            return ChronoUnit.DAYS.between(date1, date2);
        } else {
            return ChronoUnit.DAYS.between(date2, date1);
        }
//        int yearDays = between.getYears() * 356;
//        int monthDays = between.getMonths() * 30;
//        return yearDays + monthDays + between.getDays();
    }
}
