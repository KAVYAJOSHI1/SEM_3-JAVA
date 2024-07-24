/*2. Write a Java program to demonstrate the use of static class members by creating a class Counter
that has a static variable to count the number of objects created. Include a static method to display
the count.*/
import java.util.*;
public class a2
{
    static int count=0;
    a2()
    {
        count++;
        System.out.println("THE NUMBER OF OBJECTS CREATED ARE"+count);
    }
    public static void main(String args[])
    {
        a2 obj=new a2();
        a2 obj1=new a2();
        a2 obj2=new a2();
    }
}