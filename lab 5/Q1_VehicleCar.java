class Vehicle {
    void start() { System.out.println("Vehicle started"); }
}

class Car extends Vehicle {
    @Override
    void start() { System.out.println("Car started"); }
}

public class Q1_VehicleCar {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
        c.start();
    }
}
