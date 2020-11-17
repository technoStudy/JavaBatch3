package technoStudy.Day39;

public class Slide9 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            inner:
            for (int j = 0; j < 5; j++) {
                break outer; // can break out outer labeled loop
            }
        }
    }
}
