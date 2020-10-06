package technoStudy.Day13;

public class _02__BreakInsideLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                break;
            }
            System.out.println(i); // when i = 5 this part is never executed, because we exited the loop
        }

    }
}
