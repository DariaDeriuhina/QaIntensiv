package classes_oop_lesson2.classwork;

public class Car{

    private String model;
    private int year;
    private boolean isEngineActive;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isEngineActive() {
        return isEngineActive;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void activateEngine() {
        this.isEngineActive = true;
    }

    public void deactivateEngine() {
        this.isEngineActive = false;
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2018);
        System.out.println(car.isEngineActive());
        car.activateEngine();
        System.out.println(car.isEngineActive());
    }
}
