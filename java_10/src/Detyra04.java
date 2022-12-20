public class Detyra04 {
    public static void main(String[] args){
        Car car1 = new BMW();
        VW car2 = new VW();

        shtypDetajet(car1);
        shtypDetajet(car2);
    }

    public static void shtypDetajet(Car car){
        System.out.println("Speed: " + car.maxAllowedSpeed());
        System.out.println("No. Doors: " + car.numberOfDoors());
    }
}

abstract class Car {
    abstract double maxAllowedSpeed();
    abstract int numberOfDoors();
}

class BMW extends Car {
    public double maxAllowedSpeed(){
        return 200.0;
    }

    public int numberOfDoors(){
        return 3;
    }
}
class VW extends Car {
    public double maxAllowedSpeed(){
        return 170.0;
    }
    public int numberOfDoors(){
        return 5;
    }
}