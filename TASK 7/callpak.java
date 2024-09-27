import shapes.*;
public class callpak
{
    public static void main(String args[])
    {
        Circle obj=new Circle(5);
        System.out.println("AREA OF CIRCLE="+obj.area());
        System.out.println("CIRCUMFERENCE OF CIRCLE="+obj.circumference());

        Rectangle obj1=new Rectangle(5,6);
        System.out.println("AREA OF RECTANGLE="+obj1.area());
        System.out.println("PERIMETER OF RECTANGLE="+obj1.perimeter());
    }
}