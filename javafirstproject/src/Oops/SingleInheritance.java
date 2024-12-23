package Oops;
class Cycle {
    String type;

    public Cycle(String type) {
        this.type = type;
    }
    void displayCycle() {
        System.out.println("Cycle: Type = " + type);
    }
}
class Scooty extends Cycle {
    int mileage;

    public Scooty(String type, int mileage) {
        super(type); // Call parent class constructor
        this.mileage = mileage;
    }
    void displayScooty() {
        System.out.println("Scooty: Type = " + type + ", Mileage = " + mileage + " kmpl");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Scooty scooty = new Scooty("Two-Wheeler", 60);
        scooty.displayScooty(); // Child method
        scooty.displayCycle();  // Parent method
    }
}
