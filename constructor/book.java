/*Write a Java program to demonstrate the use of constructor overloading by creating multiple
constructors for a class book that accepts different parameters (title, author, ISBN).*/

import java.util.*;
public class book
{
    String title;
    String author;
    int ISBN;

book(String t,String a,int I)
{
    title=t;
    author=a;
    ISBN=I;
 
}
book()
{
    title="Kavya";
    author="GOD";
}

public static void main(String args[])
{
    book obj=new book("Java","James Gosling",123);
    System.out.println("Title:"+obj.title);
    System.out.println("Author:"+obj.author);
    System.out.println("ISBN:"+obj.ISBN);
    book obj1=new book();
    System.out.println("Title:"+obj1.title);
    System.out.println("Author:"+obj1.author);
    
    
}
}
