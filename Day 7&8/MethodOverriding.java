class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running at 60 km/h");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();

        Bike b = new Bike();
        b.run();
    }
}
