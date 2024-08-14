import java.util.*;
public class Application
{
    String brand;
    int power;
    Application(String a,int b)
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