package shapes;

public class Rectangle
{
    double length;
    double width;

    public Rectangle(double l,double w)
    {
      length=l;
      width=w;
    }

    public double area()
    {
        return length * width;
    }

    public double perimeter()
    {
        return 2*(length+width);
    }
}