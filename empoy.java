import java.util.*;
public class empoy
{
    protected String name;
    protected String id;
    empoy(String a,String b)
    {
        name=a;
        id=b;
    }
    void display()
    {
        System.out.println("NAME IS "+name);
        System.out.println("ID IS "+id);
    }
}