
public class circle extends shape
{
    circle(int radius)
    {
    super(radius,radius);
    }
    void display()
    {
        super.display();
    }
    public static void main(String args[])
    {
       
        circle obj=new circle(4);
        obj.display();
    }
}