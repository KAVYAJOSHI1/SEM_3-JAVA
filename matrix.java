import java.util.*;
public class matrix
{
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int a[][]=new int[5][5];
    System.out.println("ENTER THE FIRST MATRIX ELEMENTS");
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            a[i][j]=s.nextInt();
        }
    }
    System.out.println("SUM OF DIAGONAL ELEMENT IS:");
    int sum=0;
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            if(i==j)
            {
                sum=sum+a[i][j];
            }
            
        }
     
    }
    System.out.println(sum);
    int sum1=0;
    System.out.println("SUM OF UPPER RIGHT TRIANGLE IS");
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            if(i<j)  
            {
                sum1=sum1+a[i][j];
            }
        }   
    }
    System.out.print(sum1);
    int sum2=0;
    System.out.println("SUM OF LOWER RIGHT TRIANGLE IS");
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            if(i>j)  
            {
                sum2=sum2+a[i][j];
            }
        }   
    }
    System.out.print(sum2);
}}
