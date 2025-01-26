package classes_oop_lesson2.classwork;

public class GasCar extends Transport {
    private double levelOfFuel;
    private int maxTankVolume;

    public GasCar(String model, int year, int maxTankVolume) {
        super(model, year);
        levelOfFuel = 0.0;
        this.maxTankVolume = maxTankVolume;
    }

    public double getLevelOfFuel() {
        return levelOfFuel;
    }

    @Override
    public boolean fuel() {
        levelOfFuel = maxTankVolume;
        return true;
    }

    @Override
    public boolean needsRefueling() {
        return levelOfFuel/maxTankVolume*100<20;
    }

    @Override
    public void getInfoAboutFuel() {
        System.out.println(levelOfFuel);
    }
}
