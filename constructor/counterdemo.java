/*8. Design a Java program to demonstrate the use of a static variable counterdemo in a class CounterDemo
that counts the number of objects created for that class.

*/

import java.util.*;
class counterdemo
{
    static int count=0;
     counterdemo()
    {
        count++;
        System.out.println("THE NUMBER OF OBJECTS CREATED ARE"+count);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        counterdemo obj=new counterdemo();
        counterdemo obj1=new counterdemo();
        counterdemo obj2=new counterdemo();
    }
}   
