package technoStudy.Day47.task2;

public class KarniYarik extends Food {
    private void bake(){}
    private void fry(){}

    @Override
    public void cook() {
        bake();
        fry();
    }
}
