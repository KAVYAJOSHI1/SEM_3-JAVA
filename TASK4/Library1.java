import java.util.*;

public class Library1 {
    String name;
    int price;

    // Constructor for Library1
    Library1(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Method to add a book
    void addBook(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name + " with price " + price + " has been added.");
    }

    // Method to remove a book
    void removeBook() {
        this.name = null;
        this.price = 0;
        System.out.println("Book has been removed.");
    }

    // Method to display book details
    void displayBook() {
        if (name != null) {
            System.out.println("Book: " + name + ", Price: " + price);
        } else {
            System.out.println("No book available.");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Library1 library = new Library1(null, 0);
        
        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter book price: ");
                    int price = scanner.nextInt();
                    library.addBook(name, price);
                    break;
                case 2:
                    library.removeBook();
                    break;
                case 3:
                    library.displayBook();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
