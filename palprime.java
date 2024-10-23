import java.util.Scanner;

public class palprime {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the range
        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Palprime numbers between " + lowerLimit + " and " + upperLimit + " are:");

        // Loop through the range
        for (int number = lowerLimit; number <= upperLimit; number++) {
            // Initialize count for prime check
            int count = 0;

            // Check if the number is prime
           
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        count++; // Increment count for each divisor
                    }
                }
            

            // Check if the number is a palindrome
            int reversed = 0;
            int rem=0;
            int original = number;
            while (original > 0) {
                rem=(original % 10);
                reversed = reversed * 10 + rem;
                original /= 10;
            }

            // If it's both prime (count == 2) and palindrome (number == reversed), print it
            if (count == 2 && number == reversed) {
                System.out.println(number);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
