// Package declaration
package myPackage;

public class MyClass {
    private String message;

    // Constructor to initialize message
    public MyClass(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("User-Defined Package Message: " + message);
    }

    // Method to set a new message
    public void setMessage(String message) {
        this.message = message;
    }

    // Method to get the current message
    public String getMessage() {
        return this.message;
    }
}
