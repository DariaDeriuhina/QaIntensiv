package abstraction_lesson4.homework.vehicle.second_option;

public class VehicleFactory {
    public Vehicle createVehicle(TypeOfVehicle typeOfVehicle){
        return typeOfVehicle.getVehicle();
    }
}
