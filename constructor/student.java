/*4. Implement a Java program to show the use of the student keyword by creating a class Student with
attributes name and age, and a method displayInfo() that uses this statement to display the student's
information.*/

import java.util.*;
public class student
{
    String name;
    int age;
    Scanner s=new Scanner(System.in);
    student()
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
        student obj=new student();
        student obj1=new student();
        student obj2=new student();
        obj.displayInfo();
        obj1.displayInfo();
        obj2.displayInfo();
    }
}