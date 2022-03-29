package model;


public class Car {
    private String color;
    private int engine;
    private String model;

    public Car() {
    }

    public Car(String color, int engine, String model) {
        this.color = color;
        this.engine = engine;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine=" + engine +
                ", model='" + model + '\'' +
                '}';
    }
}
