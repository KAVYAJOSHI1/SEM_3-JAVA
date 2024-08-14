import java.util.*;
public class Appliance
{
    protected String brand;
    protected  int power;
    Appliance(String a,int b)
    {
        brand=a;
        power =b;
    }
    void display()
    {
        System.out.println("BRAND IS: "+brand);
        System.out.println("POWER IS: "+power);
    }
}