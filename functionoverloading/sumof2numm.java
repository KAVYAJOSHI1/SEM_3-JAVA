//USING FUNCTION OVERLOADING FIND THE SUM OF TWO NUMBERS
import java.util.*;
public class sumof2numm
{
    int  summ(int a,int b)
    {
        return a+b;
    }
    double summ(double a,double b)
    {
        return a+b;
    }

public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER TWO NUMBERS");
    double a=s.nextDouble();
    double b=s.nextDouble();
    sumof2numm obj=new sumof2numm();
    System.out.println("SUM:"+obj.summ(a,b));
    System.out.println("ENTER TWO NUMBERS");
    int c=s.nextInt();
    int d=s.nextInt();
   
    System.out.println("SUM:"+obj.summ(c,d));
}
}