package technoStudy.Day15;

public class _02_EnhancedForLoopForArraysTask3 {
    // given the provided array
    // for each element:
    // print the ASCII value of each character in the same line separated by space
    public static void main(String[] args) {
        String[] list = {"meat", "fruits", "vegetables",  "milk"};

        for (String element : list) {

            for (int i = 0; i < element.length(); i++) {
                char charAt = element.charAt(i);
                int ascii = (int) charAt;
                System.out.print(ascii);
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
