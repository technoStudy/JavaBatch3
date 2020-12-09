package technoStudy.Day51;

public class Cases {
    public static void main(String[] args) {
        String year = "Senior";
        switch (year) {
            case "Freshman":default:case "Sophomore":case "Junior":
                System.out.print("See you next year");
                break;
            case "Senior":
                System.out.print("Congratulations");
        }
    }
}
