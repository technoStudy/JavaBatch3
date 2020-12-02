package technoStudy.Day47.task1;

public class ExpensiveCar implements Car {
    private  Engine engine;
    private  Engine secondEngine;
    private  BreakingSystem breakingSystem;
    private  Transmission transmission;

    public ExpensiveCar() {
        engine =new Engine();
        breakingSystem = new BreakingSystem();
        transmission = new Transmission();
        secondEngine = new Engine();
    }

    public void start() {
        engine.start();
        transmission.changeGears();
    }
    public void drive() {
        transmission.changeGears();
        secondEngine.start();
    }
    public void stop() {
        secondEngine.stop();
        breakingSystem.startBreaking();
        engine.stop();
    }
}
