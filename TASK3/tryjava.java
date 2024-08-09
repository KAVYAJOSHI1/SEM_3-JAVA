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
        System.out.println("SUM IS:"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("INVALID DIVISION");
        }
        finally{
            s.close();
        }

    }
}