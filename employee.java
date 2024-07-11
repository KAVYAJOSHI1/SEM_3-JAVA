/*2. Define a Java class Employee with private attributes name and salary. Implement methods to:
• Access and display the private data using getter methods.
• Update the salary using a setter method.*/

import java.util.*;
class employee
{
    private String name;
    private int salary;
   void getter(String name,int salary)
   {
       this.name=name;
       this.salary=salary;
       
   }
   void setter(int salary)  
   {
       this.salary=salary;
       System.out.println(name+" "+salary);
   }             

public static void main(String args[])
{
    employee obj=new employee();
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER THE NAME AND SALARY");
    String name=s.next();
    int salary=s.nextInt();
    obj.getter(name,salary);
    System.out.println("ENTER THE NEW SALARY");
    int newsalary=s.nextInt();
    obj.setter(newsalary);
}
}