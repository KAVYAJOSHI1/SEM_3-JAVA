//to find area of rectangle in int and double using function overloading
import java.util.*;
class rectangle
{
    int area(int l,int b)
    {
        return l*b;
    }
  double area(double l,double b)
{
    return l*b;
}
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER LENGTH AND BREADTH");
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println("ENTER LENGTH AND BREADTH");
    double c=s.nextDouble();
    double d=s.nextDouble();
    rectangle obj=new rectangle();
    System.out.println("AREA OF RECTANGLE="+obj.area(a,b));
    System.out.println("AREA OF RECTANGLE="+obj.area(c,d));
}
}