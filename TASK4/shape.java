import java.util.*;
public class shape
{
    protected int a;
    protected int b;
    shape(int l,int B)
    {
        a=l;
        b=B;
    }
    int area()
    {
        return a*b;
    }
    void display()
    {
        System.out.println("THE AREA IS: "+ area());
    }
   

}