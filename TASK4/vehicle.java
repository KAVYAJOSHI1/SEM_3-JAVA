import java.util.*;
public class vehicle
{
    protected int make;
    protected int model;
    vehicle(int a,int b)
    {
        make=a;
        model=b;
    }
    void display()
    {
        System.out.println("THE MAKE IS: "+make);
        System.out.println("THE MODEL IS: "+model);
    }

}