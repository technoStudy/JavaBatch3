package technoStudy.Day35._04_formattingAndParsing.formatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // ofLocalizedDate
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(now.format(formatter));

        // ofPattern
        formatter = DateTimeFormatter.ofPattern("YYMMMdd, GGGG");
        String formattedDate = now.format(formatter);
        System.out.println("Custom formatted date: " + formattedDate);

    }
}
