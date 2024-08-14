/*10. Write a Java program to handle an exception without using try-catch by declaring a method that
throws an exception (e.g., IOException) and invoking this method in the main method.   */
import java.io.IOException;
public class a10 {
    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
    public static void methodThatThrowsException() throws IOException { throw new IOException("This is an exception"); }
}        