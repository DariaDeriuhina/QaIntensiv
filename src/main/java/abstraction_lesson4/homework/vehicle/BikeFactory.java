package abstraction_lesson4.homework.vehicle;

public class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
