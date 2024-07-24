/*7. Write a Java program to demonstrate exception handling by performing division of two numbers
provided by the user. Include proper handling of potential ArithmeticException (e.g., division by
zero) using try-catch blocks.
*/
import java.util.*;

public class a7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        try {
            int a = s.nextInt();
            int b = s.nextInt();

            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            s.close();
        }
    }
}
