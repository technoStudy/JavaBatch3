package technoStudy.Day37.throwingException;

public class ReThrowingRuntimeException {
    public static void main(String[] args) {
        String input = "";
        try {
            char charAt = input.charAt(1);
        } catch (NullPointerException e) {
            System.out.println("The input is null");
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("The input index not found");
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
