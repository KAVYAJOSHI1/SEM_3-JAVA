/*12. Write a Java program to demonstrate constructor overloading by creating multiple constructors
for a class Vehicle that accept different parameters (e.g., make, model, year, price).*/
// Vehicle Class renamed to a12
class a12 {
    private String make;
    private String model;
    private int year;
    private double price;

    // Default Constructor
    public a12() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }

    // Constructor with make and model
    public a12(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 0;
        this.price = 0.0;
    }

    // Constructor with make, model, and year
    public a12(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = 0.0;
    }

    // Constructor with all parameters
    public a12(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}

// Main Class

    public static void main(String[] args) {
        // Using default constructor
        a12 vehicle1 = new a12();
        vehicle1.displayDetails();
        System.out.println();

        // Using constructor with make and model
        a12 vehicle2 = new a12("Toyota", "Corolla");
        vehicle2.displayDetails();
        System.out.println();

        // Using constructor with make, model, and year
        a12 vehicle3 = new a12("Honda", "Civic", 2020);
        vehicle3.displayDetails();
        System.out.println();

        // Using constructor with all parameters
        a12 vehicle4 = new a12("Ford", "Mustang", 2021, 55000.0);
        vehicle4.displayDetails();
    }

