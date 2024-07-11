import java.util.*;
public class pattern1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}