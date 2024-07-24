/*3. Write a Java program to demonstrate the use of a copy constructor by creating a class Rectangle
with attributes length and width. Implement a copy constructor to create a new Rectangle object as
a copy of an existing one.*/
import java.util.*;
public class a3
{
    int length;
    int width;
    a3(int l,int w)
    {
        length=l;
        width=w;
    }
    a3(a3 obj)
    {
        length=obj.length;
        width=obj.width;
    }
    void display()
    {
        System.out.println("Length="+length);
        System.out.println("Width="+width);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length and width");
        int l=s.nextInt();
        int w=s.nextInt();
        a3 obj=new a3(l,w);
        obj.display();
        a3 obj1=new a3(obj);
        obj1.display();
    }
}