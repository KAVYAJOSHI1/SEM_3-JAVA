import java.util.*;
public class linearsearch
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int temp=0;
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("ENTER THE NUMBER TO BE SEARCHED");
        int n=s.nextInt();
        for (int i=0;i<10;i++)
        {
            if(a[i]==n)
            {
                temp=1;
            }
        }
        if(temp==1)
        {
            System.out.println("SEARCH SUCCESSFULL");
        }
        else{
            System.out.println("SEARCH UNSUCCESSFULL");
        }
    }
}