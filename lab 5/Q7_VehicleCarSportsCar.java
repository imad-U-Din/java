class VehicleQ7 {
    void start() { System.out.println("Vehicle started"); }
}

class CarQ7 extends VehicleQ7 {
    void drive() { System.out.println("Car driving"); }
}

class SportsCar extends CarQ7 {
    @Override
    void drive() { System.out.println("Sports car driving fast"); }
}

public class Q7_VehicleCarSportsCar {
    public static void main(String[] args) {
        VehicleQ7 v = new VehicleQ7();
        v.start();

        CarQ7 c = new CarQ7();
        c.start();
        c.drive();

        SportsCar sc = new SportsCar();
        sc.start();
        sc.drive();
    }
}
