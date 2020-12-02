package technoStudy.Day47.task2;

public class Kebab extends Food {
    private void marinade(){}
    private void grill(){}

    @Override
    public void cook() {
        marinade();
        grill();
    }
}
