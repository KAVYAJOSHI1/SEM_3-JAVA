import java.util.*;
public class staticcount
{
     static int count;
    public  staticcount()
    {
        count=count+1;
    }
    static void  temp()
    {
        count++;
    }
    void display()
    {
        System.out.println("COUNT IS:"+count);
    }
    public static void main(String args[])
    {
        staticcount obj1=new staticcount();
        obj1.display();
        obj1.temp();
        obj1.display();
        staticcount obj2=new staticcount();
        obj2.display();
        staticcount obj3=new staticcount();
        obj3.display();


    }

}