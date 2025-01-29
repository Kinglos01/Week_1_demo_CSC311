package org.example;

class Vehicle {

    private  int wheelnum;
    private String color;
    private float engsize;
    private String fuel;


    public int getnumberOfWheels(){
        return wheelnum;
    }

    public String getVehicleColor(){
        return color;
    }

    public float getEnginesize(){
        return engsize;
    }

    public String getFuelType(){
        return fuel;
    }

    public Vehicle(int wheels, String C, float E, String F){
        wheelnum = wheels;
        color = C;
        engsize = E;
        fuel = F;
    }

}
