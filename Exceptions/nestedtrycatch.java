import java.util.*;
public class nestedtrycatch
{
    public static void main(String args[])
    {
        int a[]=new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        Scanner s =new Scanner(System.in);
        boolean flag=true;
        while(flag)
        {
        System.out.println("ENTER THE VALUE OF INDEX");
        int ind=s.nextInt();
        try{
            System.out.println("Hello");
            try
            {
              System.out.println(a[ind]);
              flag=false;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array index out of bounds exception");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in level 1");
        }
    }
    System.out.println("Program completed");
    }
}
