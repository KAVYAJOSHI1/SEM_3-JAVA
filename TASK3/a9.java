/*9. Write a Java program to handle multiple exceptions using a single catch block by performing
various arithmetic operations and handling potential ArithmeticException and
NumberFormatException.*/
import java.util.*;
public class a9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        try
        {
            System.out.println("Enter 2 numbers:");
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("The result is:"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}