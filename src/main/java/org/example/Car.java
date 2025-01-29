package org.example;

public class Car extends org.example.Vehicle {

    private String brand;

    public Car(int wheels, String C, float E, String F, String B) {
        super(wheels, C, E, F);
        brand = B;

    }

    public String getBrand(){
        return brand;
    }

    public void Honk(){
        System.out.println("Honk,Honk!");
    }

    public void displayInfo(){
        System.out.println(
               " Color: "+ getVehicleColor() + "\n Number of Wheels: " + getnumberOfWheels() +
                     "\n Fuel Type: " + getFuelType() + "\n Engine Size: " + getEnginesize() + "\n Brand:" + brand
        );
    }
}
