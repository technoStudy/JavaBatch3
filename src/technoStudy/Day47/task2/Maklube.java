package technoStudy.Day47.task2;

public class Maklube extends Food {
    private void design(){}
    private void boil(){}
    private void fry(){}

    @Override
    public void cook() {
        boil();
        fry();
        design();
    }
}
