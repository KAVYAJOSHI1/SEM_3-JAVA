
public class rectangle extends shape
{
    rectangle(int length,int breadth)
    {
    super(length,breadth);
    }
    void display()
    {
        super.display();
    }
    public static void main(String args[])
    {
       
        rectangle obj=new rectangle(4,5);
        obj.display();
    }
}