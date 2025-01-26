package classes_oop_lesson2.classwork;

public class ElectricCar extends Transport {

    private double levelOfElectricity;

    public ElectricCar(String model, int year) {
        super(model, year);
        levelOfElectricity = 0.0;
    }

    public double getLevelOfElectricity() {
        return levelOfElectricity;
    }

    @Override
    public boolean fuel() {
        levelOfElectricity = 100;
        return true;
    }

    @Override
    public boolean needsRefueling() {
        return levelOfElectricity<20;
    }

    @Override
    public void getInfoAboutFuel() {
        System.out.println(levelOfElectricity);
    }
}
