import java.util.Scanner;
                                          
public class magicnumber {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number to check later
        int originalNumber = number;

        // Reduce the number by summing its digits until it becomes a single digit
        while (number > 9) {
            int sum = 0;

            // Calculate the sum of digits
            while (number > 0) {
                sum += number % 10;  // Get the last digit 123 3+ 2+ 1=6
                number /= 10;        // Remove the last digit
            }

            // Update number to the sum of its digits
            number = sum;
        }

        // If the result is 1, the number is a magic number
        if (number == 1) {
            System.out.println(originalNumber + " is a magic number.");
        } else {
            System.out.println(originalNumber + " is not a magic number.");
        }

        // Close the scanner
        scanner.close();
    }
}
