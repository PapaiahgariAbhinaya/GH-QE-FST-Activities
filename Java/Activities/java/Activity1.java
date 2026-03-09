public class Activity1{
    public static void main(String[] args){
    Car bmw =new Car();
    bmw.make=2014;
    bmw.color="Black";
    bmw.transmission="Manual";

    bmw.displayCharacteristics();
    bmw.accelarate();
    bmw.brake();
}  
}
class Car{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(){
         tyres=4;
         doors=4;
    }
     public void displayCharacteristics(){
        System.out.println("Color of the car:"+color);
        System.out.println("make of the car:"+make);
        System.out.println("transmission of the car:"+transmission);
    }
    public void accelarate(){
        System.out.println("Car is accelerating");
    }
    public void brake(){
        System.out.println("Car is breaking");
    }
}