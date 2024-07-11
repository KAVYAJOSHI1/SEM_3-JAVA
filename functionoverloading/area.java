//METHOD OVERLOADING PROGRAM TO FING AREA OF RECTANGLE AND SQUARE
import java.util.*;
class area
{
    double area(double l,double b)
    {
        return l*b;
    }
    double area(double l)   
    {
        return l*l;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER LENGTH AND BREADTH");
        int l=s.nextInt();
        int b=s.nextInt();
        area obj=new area();
        System.out.println("AREA OF RECTANGLE="+ obj.area(l,b));
        System.out.println("AREA OF SQUARE="+ obj.area(l));
    }
}