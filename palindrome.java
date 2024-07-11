import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=s.nextInt();
        int rem,rev=0;
        int n1=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(n1==rev)
        {
            System.out.println("IT IS PALINDROME NUMBER");
        }
        else{
            System.out.println("IT IS NOT A PALINDROME NUMBER");
        }
    }
}