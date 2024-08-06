//1. Write a Java program to demonstrate constructor overloading by creating multiple constructors
//for a class Person that accept different parameters (e.g., name, age, address)
//hi
import java.util.*;
public class a1
{
    a1(String name,int age,String address)
    {
        System.out.println(name+" "+age+" "+address);
    }

    a1(String name,int age)
    {
        System.out.println(name+" "+age);
    }

    a1(String name)
    {
        System.out.println(name);
    }
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NAME,AGE AND ADDRESS");
        String name=s.next();
        int age=s.nextInt();
        String address=s.next();
        a1 obj=new a1(name,age,address);
        a1 obj1=new a1(name,age);
        a1 obj2=new a1(name);

    }
}
