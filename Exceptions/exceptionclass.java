import java.util.*;
class MyException extends Exception
{
    public   String toString()
   {
    return super.toString() + "Number cannot be less than 99";
   }

public String getMessage()
{
    return super.getMessage() + "Number cannot be less than 99"; 
}   
}
public class exceptionclass
{
    public static void main(String args[])
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a<99)
        {
            try{
        throw new MyException();
            }
            catch(MyException e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
    }
    System.out.println("Executed successfully");
    }
}