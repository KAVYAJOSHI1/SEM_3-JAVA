package shapes;

public class Circle
{
    double radius;

    public Circle(double r)
    {
        this.radius=r;
    }

    double area()
    {
        return Math.PI * radius * radius;
    }

    double circumference()
    {
        return 2*Math.PI*radius;
    }
}