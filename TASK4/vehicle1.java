import java.util.*;
public class vehicle1 
{
    protected int make;
    protected int model;
    vehicle1(int a,int b)
    {
        make=a;
        model=b;
    }
    void display()
    {
        System.out.println("IT WAS MADE IN"+ make);
        System.out.println("MODEL NUMBER IS:"+model);
    }
}