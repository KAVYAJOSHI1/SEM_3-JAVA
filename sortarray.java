//using bubble sort
import java.util.*;
public class sortarray
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
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }   
            }   
        }    
        System.out.println("SORTED ARRAY IS");   
        for(int i=0;i<10;i++)   
        {   
            System.out.println(a[i]);
        }
    }   
}