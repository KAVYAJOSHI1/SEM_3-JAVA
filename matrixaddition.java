//using validation add 2 matrix
import java.util.*;
public class matrixaddition
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        System.out.println("ENTER THE ELEMENTS:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=s.nextInt();
                b[i][j]=s.nextInt();
                if(a[i][j]>0&&a[i][j]<50 &&b[i][j]>0&&b[i][j]<50)
                {
                    continue;
                }
                else
                {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }

        int c[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("SUM");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}