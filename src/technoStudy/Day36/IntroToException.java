package technoStudy.Day36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IntroToException {
    public static void main(String[] args) {
        System.out.println("Please input date in format of MM dd YYYY:");
        Scanner scanner = new Scanner(System.in);
        String electionDate = scanner.nextLine().substring(0, 10);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");
        try {
            LocalDate election = LocalDate.parse(electionDate, formatter);
            System.out.println(election);
        } catch (Exception exception){
           // this part will only run if there is an exception
//            System.out.println(exception.getMessage());
            System.out.println("Your input is incorrect, please use format MM dd YYYY");
        }


        try {
            // try running some code that can throw an exception
        } catch (Exception e) {
            // handle the exception
        }
    }
}
