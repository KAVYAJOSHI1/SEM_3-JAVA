/*4. Write a Java program to demonstrate the use of the this keyword by creating a class Student with
attributes name and age, and a method displayInfo() that uses this to display the student's
information.*/
import java.util.*; 
public class a4
{
    String name;
    int age;
    Scanner s=new Scanner(System.in);
    a4()
    {
        System.out.println("ENTER THE NAME AND AGE");
        this.name=s.next();
        this.age=s.nextInt();
    }
    void displayInfo()
    {
        System.out.println("NAME:"+this.name);
        System.out.println("AGE:"+this.age);
    }
    public static void main(String args[])
    {
        a4 obj=new a4();
        a4 obj1=new a4();
        a4 obj2=new a4();
        obj.displayInfo();
        obj1.displayInfo();
        obj2.displayInfo();
    }
}