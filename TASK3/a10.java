/*10. Write a Java program to handle an exception without using try-catch by declaring a method that
throws an exception (e.g., IOException) and invoking this method in the main method.   */
import java.io.IOException;

public class a10{

    // Method that throws an IOException
    public static void throwIOException() throws IOException {
        System.out.println("Inside throwIOException method.");
        // Simulating an exception
        throw new IOException("This is an IOException.");
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Starting main method.");
        // Invoking the method that throws an IOException
        throwIOException();
        System.out.println("End of main method.");
    }
}
