package technoStudy.Day32.task1;

public class TimeConverter {
    final static int secondsInAMinute = 60;
    final static int minutesInAnHour = 60;

    static int convertSecondsIntoMinutes(int seconds){
        return seconds/secondsInAMinute;
    }

    static int convertIntoSeconds(int minutes){
        return minutes * secondsInAMinute;
    }

    static int convertIntoHours(int minutes) {
        return minutes/minutesInAnHour;
    }

    static int convertHoursIntoMinutes(int hours){
        return hours*minutesInAnHour;
    }
}
