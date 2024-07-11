/*11. Create a Java class Car with attributes make, model, and year. Implement:
• An array carArray to store 3 Car objects.
• Methods to add new cars to the array, display details of all cars, and find the car with the
oldest model year.*/

import java.util.Arrays;

public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Car[] carArray = new Car[3];

        // Add new cars to the array
        carArray[0] = new Car("Toyota", "Corolla", 2015);
        carArray[1] = new Car("Honda", "Civic", 2018);
        carArray[2] = new Car("Ford", "Focus", 2012);

        // Display details of all cars
        displayCars(carArray);

        // Find the car with the oldest model year
        Car oldestCar = findOldestCar(carArray);
        System.out.println("Oldest car: " + oldestCar.make + " " + oldestCar.model + " (" + oldestCar.year + ")");
    }

    public static void displayCars(Car[] carArray) {
        System.out.println("Car Details:");
        for (Car car : carArray) {
            System.out.println("Make: " + car.make + ", Model: " + car.model + ", Year: " + car.year);
        }
    }

    public static Car findOldestCar(Car[] carArray) {
        Car oldestCar = carArray[0];
        for (Car car : carArray) {
            if (car.year < oldestCar.year) {
                oldestCar = car;
            }
        }
        return oldestCar;
    }
}