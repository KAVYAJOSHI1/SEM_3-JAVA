//catching multiple errors
import java.util.*;
public class multiple
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[3];
     
        try
        {
            System.out.println("ENTER THE INDEX");
            int x=s.nextInt();
            System.out.println("Enter the number to divide with");
            int n=s.nextInt();
            a[x]=4;
             a[x]=a[x]/n;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error"+e);
        }
        catch(/*InputMismatch*/Exception e)
        {
            System.out.println("Error "+e);
        }
    }
}