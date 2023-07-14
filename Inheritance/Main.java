// Parent class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving the " + brand);
    }
}

// Child class inheriting from the parent class
class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, int numOfDoors) {
        super(brand);
        this.numOfDoors = numOfDoors;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of doors: " + numOfDoors);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("Ford", 2);
        car.displayInfo();
        car.drive();
    }
}
