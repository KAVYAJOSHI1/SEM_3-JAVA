import java.util.*;
public class employee1
{
    protected String name;
    protected int id;
    employee1(String a,int b)
    {
        name=a;
        id=b;
    }
    void display()
    {
        System.out.println("NAME OF EMPLOYEE IS :"+name);
        System.out.println("ID IS :"+ id);
    }
    
}