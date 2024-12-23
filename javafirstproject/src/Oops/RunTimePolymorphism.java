package Oops;

class Vehicle {
    void display() {
        System.out.println("Vehicle is Starting");
    }
}
class Car extends Vehicle {
    void display() {
        super.display();
        System.out.println("Car is being Driven");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Car c = new Car();
        c.display(); // Output: Vehicle is Starting -> Car is being Driven
        System.out.println("-------");

        Vehicle v = new Car(); // Upcasting is valid
        v.display(); // Output: Vehicle is Starting -> Car is being Driven
        System.out.println("---------");

        if (v instanceof Car) { // Check type before downcasting
            Car c1 = (Car) v; // Downcasting
            c1.display(); // Output: Vehicle is Starting -> Car is being Driven
        } else {
            System.out.println("Downcasting is not safe.");
        }
        System.out.println("-----------");
    }
}
