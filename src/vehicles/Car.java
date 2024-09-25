package vehicles;

public class Car extends Vehicle{
    public Car(String model){
        super();
        this.model = model;
    };

    public Car() {
        super();
    }

    @Override
    public String vehicleType() {
        return "Car";
    }

}
