/*7. Create a Java class MathOperations with a static method add that accepts two integers and returns
their sum. Implement another static method multiply that accepts two integers and returns their
product. */
import java.util.*;
public class mathoperation
{
    static int add(int a,int b)
    {
        
        return a+b;
    }
    static int multiply(int a,int b)
    {
        return a*b;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("THE SUM AND PRODUCT ARE");
        System.out.println(add(a,b));
        System.out.println(multiply(a,b));
    }
}