package classes_oop_lesson2.classwork;

public class Example {
    public static void main(String[] args) {
        Transport gasCar = new GasCar("Toyota", 2018, 42);
        Transport electricCar = new ElectricCar("Toyota", 2020);

        System.out.println(gasCar.needsRefueling());
        System.out.println(electricCar.needsRefueling());
        gasCar.fuel();
        electricCar.fuel();
        gasCar.getInfoAboutFuel();
        electricCar.getInfoAboutFuel();
        System.out.println(gasCar.needsRefueling());
        System.out.println(electricCar.needsRefueling());
    }
}
