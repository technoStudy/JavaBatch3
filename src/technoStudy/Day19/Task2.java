package technoStudy.Day19;

public class Task2 {
    //create method that calculates average of given student result
    // inputs: name and results
    // ex: Ali, 30, 40, 90, 100
    /// Ali : 65
    // ex: Bali, 30, 40, 90, 100, 95, 86
    /// Bali : 73.5
    public static void main(String[] args) {
        String averageOfAli = average("Ali", "Techno", 30, 40, 90, 100);
        System.out.println(averageOfAli);

        String averageOfBali = average("Bali", "Techno", 30.1, 40, 90, 100, 95, 86);
        System.out.println(averageOfBali);
    }

    public static String average(String name, String surname, int... scores) {
        double average;
        // implement your average calculation here
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        average = (double) sum / scores.length;
        return name + " " + surname + " : " + average;
    }

    public static String average(String name, String surname, double... scores) {
        double average;
        // implement your average calculation here
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        average = (double) sum / scores.length;
        return name + " " + surname + " : " + average;
    }
}
