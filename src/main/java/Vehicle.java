class Vehicle {

    int wheelnum;
    String color;
    float engsize;
    String fuel;


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

    public void constructor(){
        this.getnumberOfWheels();
        this.getVehicleColor();
        this.getEnginesize();
        this.getFuelType();
    }

}
