package racingcar;

public class Car {
    private String name;
    private int position;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.position = 0;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        if (engine.accelerate()) {
            position++;
        }
    }
}