package technoStudy.Day48.task1;

public class Wayne extends Batman {
    @Override
    public String quality() {
        return super.quality() + "\n" + "I am WAYNE too";
    }
}
