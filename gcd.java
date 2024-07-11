import java.util.*;
public class gcd
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("ENTER THE TWO NUMBERS");
        a=s.nextInt();
        b=s.nextInt();
        int gcd=0;
        if(a>b)
        {
            
                for(int i=1;i<=b;i++)
                if(a%i==0 && b%i==0)
                {
                     gcd=i;
                     
                }
            
                System.out.println("GCD IS:"+gcd);
            
            }
            else
            {
                System.out.println("INVALID INPUT,ENTER FIRST NUMBER GREATER");
            }
        }
    }
