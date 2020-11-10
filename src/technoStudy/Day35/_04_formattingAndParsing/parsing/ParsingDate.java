package technoStudy.Day35._04_formattingAndParsing.parsing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParsingDate {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");
        String electionDate = "11 03 2020";
        LocalDate  election = LocalDate.parse(electionDate, formatter);
        String toString = election.toString();
        System.out.println(toString);
    }
}
