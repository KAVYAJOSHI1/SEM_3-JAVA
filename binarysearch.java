import java.util.*;
public class binarysearch
{
    public static void main(String args[])
    {
        int temp=0;
        int a[]=new int[10];
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("ENTER THE NUMBER TO BE SEARCHED");
        n=s.nextInt();
        for(int i=0;i<9;i++)
        {
            for(int j=i+1;j<10;j++)
            {
              if(a[i]>a[j])
              {
                 temp=a[j];
                  a[i]=a[j];
                  a[j]=temp;
              }
            }
        }
        int first=0;int last=9;int mid;
        
        while(first<=last)
        {
        mid=((first+last)/2);
        if(a[mid]==n)
        {
            
            temp=1;
            break;
        }
         if(a[mid]>n)
        {
            last=mid-1;
        }
         if(a[mid]<n)
        {
            first=mid+1;
        }
    }
        if(temp==1)
        {
            System.out.println("NUMBER FOUND");
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
    }
