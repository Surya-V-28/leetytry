import java.util.*;


// Custom exception for invalid car operations
class InvalidCarOperationException extends Exception {
    public InvalidCarOperationException(String message) {
        super(message);
    }
}

// Interface Vehicle with methods start() and stop()
interface Vehicle {
    void start() throws InvalidCarOperationException;
    void stop() throws InvalidCarOperationException;
}

// Interface Engine with method changeGear()
interface Engine {
    void changeGear(int gear) throws InvalidCarOperationException;
}

// Interface Transmission with method changeGear()
interface Transmission {
    void changeGear(int gear) throws InvalidCarOperationException;
}

// Car class implementing Vehicle, Engine, and Transmission interfaces
class Car implements Vehicle, Engine, Transmission {
    private boolean isEngineOn = false;
    private boolean isCarRunning = false;
    
    // Implement start method from Vehicle interface
    @Override
    public void start() throws InvalidCarOperationException {
        if (isEngineOn) {
            throw new InvalidCarOperationException("Engine is already on.");
        }
        isEngineOn = true;
        isCarRunning = true;
        System.out.println("Car started.");
    }
    
    // Implement stop method from Vehicle interface
    @Override
    public void stop() throws InvalidCarOperationException {
        if (!isEngineOn) {
            throw new InvalidCarOperationException("Engine is not running.");
        }
        isCarRunning = false;
        System.out.println("Car stopped.");
    }
    
    // Implement changeGear method for both Engine and Transmission interfaces
    @Override
    public void changeGear(int gear) throws InvalidCarOperationException {
        if (!isCarRunning) {
            throw new InvalidCarOperationException("Cannot change gears while the car is stopped.");
        }
        System.out.println("Gear changed to: " + gear);
    }
}

// Main class to test the Car class
public class InterfaceMulti {
    public static void main(String[] args) {
        Car car = new Car();
        
        try {
            car.start(); // Start the car
            car.changeGear(3); // Change gear while running
            
            // Try to start the car again
            car.start(); // This will throw an exception
            
        } catch (InvalidCarOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            car.stop(); // Stop the car
            car.changeGear(2); // Try to change gear while stopped
            
        } catch (InvalidCarOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
