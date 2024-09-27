import java.util.*;
import myPackage.*;

public class list
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(5);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        MyClass obj=new MyClass("Hello");
        obj.displayMessage();
        obj.setMessage("World");
        System.out.println(obj.getMessage());
    }
}