import java.util.*;

public class numbers
{
    static void armstrong(int n)
    {
        int rem=0,rev=0,sum=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        while(rev>0)
        {
            rem=rev%10;
            sum=sum+rem*rem*rem;
            rev=rev/10;
        }
        if(sum==n)
        {
            System.out.println("ARMSTRONG NUMBER");
        }
        else
        {
            System.out.println("NOT ARMSTRONG NUMBER");
        }
    }

    static void perfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println("PERFECT NUMBER");
        }
        else
        {
            System.out.println("NOT PERFECT NUMBER");
        }
    }   

    static void prime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("PRIME NUMBER");
        }
        else
        {
            System.out.println("NOT PRIME NUMBER");
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER 1 FOR ARMSTRONG NUMBER");
        System.out.println("ENTER 2 FOR PERFECT NUMBER");
        System.out.println("ENTER 3 FOR PRIME NUMBER");
        int choice=s.nextInt();
        System.out.println("ENTER THE NUMBER");
        int n=s.nextInt();
        switch(choice)
        {
            case 1:
            {
                armstrong(n);
                break;
            }
            case 2:
            {
                perfect(n);
                break;
            }
            case 3:
            {
                prime(n);
                break;
            }
            default:
            {
                System.out.println("INVALID CHOICE");
            }
        }
    }
}