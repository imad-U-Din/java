abstract class VehicleQ11 {
    abstract void drive();
}

class CarQ11 extends VehicleQ11 {
    @Override
    void drive() { System.out.println("Driving a car"); }
}

class BikeQ11 extends VehicleQ11 {
    @Override
    void drive() { System.out.println("Driving a bike"); }
}

public class Q11_VehicleCarBike {
    public static void main(String[] args) {
        VehicleQ11 car = new CarQ11();
        car.drive();

        VehicleQ11 bike = new BikeQ11();
        bike.drive();
    }
}
