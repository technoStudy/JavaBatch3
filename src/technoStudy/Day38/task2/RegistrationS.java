package technoStudy.Day38.task2;

public class RegistrationS {
    public static Integer countLetters(String input) {
        Integer count = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if(charAt >= 'a' && charAt <= 'z') {
                count++;
            }
        }
        return count;
    }

    public static Integer countNumbers(String input) {
        Integer count = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if(charAt >= '0' && charAt <= '9') {
                count++;
            }
        }
        return count;
    }
}
