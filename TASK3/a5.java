/*5. Write a Java program to demonstrate garbage collection by creating a class Example with a
finalize method that prints a message when the object is garbage collected. Create and nullify an
instance of Example to trigger garbage collection.*/
import java.util.*;
public class a5
{


    ~a5()
    {
        System.out.println("Object is garbage collected");
    }
    public static void main(String args[])
    {
        a5 obj=new a5();
        obj=null;

    }
}