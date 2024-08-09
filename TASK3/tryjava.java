import java.util.*;
public class tryjava
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two numbers");
        try{
        int a=s.nextInt();
        int b=s.nextInt();
        int c=a/b;
        int d=a*b;
        int e=a+b;
        System.out.println("PRODUCT IS:"+d);
        System.out.println("SUM IS:"+d);
        System.out.println("SUM IS:"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("INVALID DIVISION");
        }
        
        }

    }
