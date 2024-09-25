package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota RAW4");
        ElectricCar car2 = new ElectricCar("Tesla CyberTruck");
        car1.setOwnerName("John");
        car1.setEngineType("Dizel");
        car2.setInsuranceNumber(12345678);
        System.out.println(toString(car1));
        System.out.println(toString(car2));
    }

    public static String toString(Car car) {
        System.out.println("Information on "+car.toString());
        String out = "";
        if (car.getModel()!=null){
            out+="Model: "+ car.getModel()+"\n";
        }if (car.getLicense()!=null){
            out+="License: "+ car.getLicense()+"\n";
        }if (car.getColor()!=null){
            out+="Color: "+ car.getColor()+"\n";
        }if (car.getYear()!=0){
            out+="Year: "+ car.getYear()+"\n";
        }if (car.getOwnerName()!=null){
            out+="Owner Name: "+ car.getOwnerName()+"\n";
        }if (car.getInsuranceNumber()!=0){
            out+="Insurance Number: "+ car.getInsuranceNumber()+"\n";
        }
        if (car.getEngineType()!=null){
            out+="Engine Type: "+ car.getEngineType()+"\n";
        }
        return out;
    }
}