package technoStudy.Day37.throwingException;

public class ThrowingException {
    public static void main(String[] args) {
        try {
            throw new Exception("My custom message");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
