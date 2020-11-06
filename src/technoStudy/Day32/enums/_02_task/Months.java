package technoStudy.Day32.enums._02_task;

public enum Months {
    Jan("January"),
    Feb("February"),
    Mar("March"),
    Apr("April"),
    May("May"),
    Jun("June"),
    Jul("July"),
    Aug("August"),
    Sep("September"),
    Oct("October"),
    Nov("November"),
    Dec("December");

    final String fullName;

    Months(String name){
        fullName = name;
    }

    void printTheFirstLetter() {
        System.out.println(fullName.charAt(0));
    }
}
