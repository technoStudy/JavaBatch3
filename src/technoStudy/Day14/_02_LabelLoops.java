package technoStudy.Day14;

public class _02_LabelLoops {
    public static void main(String[] args) {
        OUTER_LOOP:
        for (int i = 0; i < 5; i++) {
            INNER_LOOP:
            for (int j = 0; j < 5; j++) {
                if(i==3){
                    System.out.println("Breaking outer_loop");
                    break OUTER_LOOP;
                }
                if(j%2!=0){
                    System.out.println("Skipping outer_loop");
                    continue OUTER_LOOP;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
