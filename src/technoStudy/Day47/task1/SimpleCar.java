package technoStudy.Day47.task1;

public class SimpleCar implements Car {
    private  Engine engine;
    private  BreakingSystem breakingSystem;
    private  Transmission transmission;

    public SimpleCar() {
        engine =new Engine();
        breakingSystem = new BreakingSystem();
        transmission = new Transmission();
    }

    public void start() {
        engine.start();
        transmission.changeGears();
    }
    public void drive() {
        transmission.changeGears();
    }
    public void stop() {
        breakingSystem.startBreaking();
        engine.stop();
    }
}
