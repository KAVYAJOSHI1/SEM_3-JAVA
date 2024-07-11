//TO FIND PALINDROME STRING
import java.util.*;
class Palindromestring
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str=s.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("PALINDROME STRING");
        }
        else
        {
            System.out.println("NOT PALINDROME STRING");
        }
    }    
}