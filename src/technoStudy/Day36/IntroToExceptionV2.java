package technoStudy.Day36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IntroToExceptionV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");

        boolean userInputSuccessfullyParsed = false;
        do {
            try {
                System.out.println("Please input date in format of MM dd YYYY:");
                String electionDate = scanner.nextLine().substring(0, 10);
                LocalDate election = LocalDate.parse(electionDate, formatter); // if this line throws exception, the rest of try block is not executed
                userInputSuccessfullyParsed = true;
                System.out.println(election);

            } catch (Exception exception){
                // this part will only run if there is an exception
//            System.out.println(exception.getMessage());
                System.out.println("Your input is incorrect");
            }
        } while (!userInputSuccessfullyParsed);

    }
}
