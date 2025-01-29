public class Car extends Vehicle {

    public String getBrand(String brand){
        return brand;
    }

    public void Honk(){
        System.out.println("Honk,Honk!");
    }

    public void displayInfo(){
        System.out.println(
               "Color: "+ this.color + "Number of WHeels: " +this.wheelnum +
                       "Fuel Type: " + this.fuel + "Engine Size: " + this.engsize
        );
    }
}
