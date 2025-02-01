package abstraction_lesson4.homework.vehicle.second_option;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.createVehicle(TypeOfVehicle.CAR);
        car.drive();
    }
}
