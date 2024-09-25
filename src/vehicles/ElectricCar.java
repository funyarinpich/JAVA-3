package vehicles;

public class ElectricCar extends Car{
    private int batteryCapacity;
    public ElectricCar() {
        super();
        engineType = "Electric";
    }
    public ElectricCar(String model) {
        super(model);
        engineType = "Electric";
    }
    @Override
    public String vehicleType() {
        return "ElectricCar";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
