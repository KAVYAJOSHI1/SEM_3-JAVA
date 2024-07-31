import java.util.*;
public class copyconstructor
{
    int a;
    copyconstructor(int x)
    {
        a=x;
        
    }
    void display()
    {
        System.out.println("VALUE OF A IS:"+ a);
    }

    public static void main(String args[])
    {
        copyconstructor obj=new copyconstructor(5);
        obj.display();
        copyconstructor obj1=new copyconstructor(obj);
        obj1.display();

    }
}