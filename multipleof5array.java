import java.util.*;
public class multipleof5array
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for (int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("MULTIPLE OF 5 ARE:");
        for(int i=0;i<10;i++)
        {
            if(a[i]%5==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
