package shapes;

public class Circle
{
    double radius;

    public Circle(double r)
    {
        this.radius=r;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}