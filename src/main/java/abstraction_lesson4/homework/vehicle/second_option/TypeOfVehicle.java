package abstraction_lesson4.homework.vehicle.second_option;

public enum TypeOfVehicle {
    CAR(new Car()),
    BIKE(new Bike());

    private Vehicle vehicle;

    TypeOfVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
