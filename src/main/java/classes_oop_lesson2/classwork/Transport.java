package classes_oop_lesson2.classwork;

public abstract class Transport implements Refuelable {
    private String model;
    private int year;

    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public abstract void getInfoAboutFuel();
}

interface Refuelable  {
    boolean fuel();
    boolean needsRefueling();
}

