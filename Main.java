// Abstract Class: Computer
abstract class Computer implements Device {
    String brand;

    // Constructor
    Computer(String brand) {
        this.brand = brand;
    }

    // Concrete method: A shared feature for all computers
    void runDiagnostics() {
        System.out.println(brand + " is running system diagnostics.");
    }
}

// Concrete Class: Laptop
class Laptop extends Computer {
    
    // Constructor
    Laptop(String brand) {
        super(brand);
    }

    // Implementing turnOn() method from interface
    @Override
    public void turnOn() {
        System.out.println(brand + " laptop is powering on.");
    }

    // Implementing turnOff() method from interface
    @Override
    public void turnOff() {
        System.out.println(brand + " laptop is shutting down.");
    }
}

// Interface: Device behaviors
interface Device {
    void turnOn();  // Power on the device
    void turnOff(); // Power off the device
}

// Testing
public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Lenovo"); // Creating a laptop object

        myLaptop.runDiagnostics(); // Inherited from Computer
        myLaptop.turnOn();         // Implemented from interface
        myLaptop.turnOff();        // Implemented from interface
    }
}