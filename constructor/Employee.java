/* Design a Java program to demonstrate the concept of constructor overloading by creating a class
Employee with attributes empId, name, salary, and designation. Implement:
• A default constructor that initializes attributes to default values.
• Parameterized constructors to initialize attributes based on different combinations of
parameters (e.g., empId and name, all attributes).*/

import java.util.*;

class Employee
{
    int empId;
    String name;
    int salary;
    String designation;
    Employee()
    {
        empId=1;
        name="JONTY";
        salary=500000;
        designation="CEO";
    }
    Employee(int empId,String name,int salary,String designation)  
    {
        this.empId=empId;
        this.name=name;
        this.salary=salary;
        this.designation=designation;
    }
    public void getter()    
    {   
        System.out.println(empId+" "+name+" "+salary+" "+designation);
    }
    public static void main(String args[])
    {
        Employee obj=new Employee();
        Employee obj1=new Employee(101,"John",50000,"Manager");
        obj1.getter();
        obj.getter();
    }
    }     