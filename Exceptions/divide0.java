//to throw exception when divided by zero
import java.util.*;
public class divide0
{
    public static void main(String argsp[])
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("ENTER THE VALUE OF A ");
        a=s.nextInt();
        System.out.println("ENTER THE VALUE OF B");
        b=s.nextInt();
        try{
            int c=a/b;
            System.out.println("Answer is: "+c);
        }
        catch(Exception e){
          System.out.println("Error: "+ e);
        }
    }
}