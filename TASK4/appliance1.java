import java.util.*;
public class appliance1
{
   protected String brand;
   protected int power;
    appliance1(String a,int b)
    {
        brand=a;
        power=b;
    }
    void display()
    {
        System.out.println("BRAND NAME IS"+ brand);
        System.out.println("POWER IS"+power);
    }
}