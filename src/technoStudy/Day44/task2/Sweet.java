package technoStudy.Day44.task2;

public abstract class Sweet extends Food {
    abstract public void madeIn();

    @Override
    public void taste() {
        System.out.println("Sweet, sugary");
    }
}
