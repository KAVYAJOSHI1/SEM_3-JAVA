/*6.Write a Java program to demonstrate the use of the final keyword by creating a class Constants
with a final variable and a final method. Show how attempting to modify the final variable or
override the final method results in a compilation error.*/

import java.util.*;
public class a6
{
    final int x=10;
    final void display()
    {
        System.out.println("x="+x);
    }
    public static void main(String args[])
    {
        a6 obj=new a6();
        obj.display();
    }
}