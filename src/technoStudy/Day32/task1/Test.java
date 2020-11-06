package technoStudy.Day32.task1;

public class Test {
    public static void main(String[] args) {

        int minutes = TimeConverter.convertHoursIntoMinutes(6);
        System.out.println(minutes);

        int seconds = TimeConverter.convertIntoSeconds(minutes);
        System.out.println(seconds);

        int intoMinutes = TimeConverter.convertSecondsIntoMinutes(seconds);
        System.out.println(intoMinutes);

        int intoHours = TimeConverter.convertIntoHours(intoMinutes);
        System.out.println(intoHours);
    }
}
