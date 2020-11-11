package technoStudy.Day36.task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate dob = null;
        do {
            System.out.println("Input your birth date:");
            String userInput = scanner.nextLine();
            dob = convertToDate(userInput);
        } while (dob == null);

        Integer age = getAge(dob);
        System.out.println("Your age is " + age);
    }


    static public LocalDate convertToDate(String userInput){
        LocalDate date = null;
        ArrayList<String> patters = new ArrayList<>(Arrays.asList("MM dd uuuu", "MM/dd/uuuu", "MM.dd.uuuu", "MM-dd-uuuu"));
        for(String pattern : patters) {
            try {
                date = LocalDate.parse(userInput, DateTimeFormatter.ofPattern(pattern));
            } catch (Exception e) {
                System.out.println("User input incorrect if using pattern " + pattern);
            }
        }
        return date;
    }

    static public Integer getAge(LocalDate DOB) {
        LocalDate now = LocalDate.now();
        Period between = Period.between(DOB, now);
        Integer age = between.getYears();
        return age;
    }
}
