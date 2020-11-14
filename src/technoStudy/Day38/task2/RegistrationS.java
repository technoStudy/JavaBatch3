package technoStudy.Day38.task2;

public class RegistrationS {
    public static int countLetters(String input) {
        if(input == null){
//            return 0;
            throw new IllegalArgumentException("The input cannot be null");
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = Character.toLowerCase(input.charAt(i));
            if(charAt >= 'a' && charAt <= 'z') {
                count++;
            }
        }
        return count;
    }

    public static int countNumbers(String input) {
        if(input == null){
            throw new IllegalArgumentException("The input cannot be null");
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if(charAt >= '0' && charAt <= '9') {
                count++;
            }
        }
        return count;
    }
}
