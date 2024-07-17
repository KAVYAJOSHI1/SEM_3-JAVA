import java.util.*;
public class array
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("ARRAY ELEMENTS ARE");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}