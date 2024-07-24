/*8. Write a Java program to demonstrate nested try-catch blocks by handling an array index out-ofbounds exception and a number format exception within the same program
*/
import java.util.*;
public class a8
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        try
        {
            for(int i=0;i<5;i++)
            {
                a[i]=s.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds exception");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number format exception");
        }
    }
}