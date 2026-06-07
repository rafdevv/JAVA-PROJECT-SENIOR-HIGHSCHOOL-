// Car class
class Car {
    String brand;
    String model;

    // Default constructor
    public Car() {
        this.brand = "Toyota";
        this.model = "Corolla";
    }

    // Parameterized constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Copy constructor
    public Car(Car otherCar) {
        this.brand = otherCar.brand;
        this.model = otherCar.model;
    }

    // Method to display car details
    public void displayCar() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

// Main class
public class CarDemo {
    public static void main(String[] args) {
        // Using default constructor
        Car car1 = new Car();
        System.out.print("Car 1 (Default): ");
        car1.displayCar();

        // Using parameterized constructor 
        Car car2 = new Car("Ferrari", "488 Spider");
        System.out.print("Car 2 (Parameterized): ");
        car2.displayCar();


        // Using copy constructor
        Car car3 = new Car(car2);
        System.out.print("Car 3 (Copy of Car 2): ");
        car3.displayCar();
    }
}
