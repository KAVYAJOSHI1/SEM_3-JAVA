//TO PRINT ALL THE PRIME NUMBERS UPTO N
import java.util.*;
class primenumberstilln
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print prime numbers");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }   
            if(count==2)
            {
                System.out.println(i);
            }
        }   
    }   
}