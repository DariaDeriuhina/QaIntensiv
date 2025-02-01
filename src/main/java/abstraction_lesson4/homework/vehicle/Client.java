package abstraction_lesson4.homework.vehicle;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new BikeFactory();
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.drive();
    }
}
