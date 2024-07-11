import java.util.*;
public class calculator
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF A AND B");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("ENTER THE CHOICE OF OPERATION");
        char ch=s.next().charAt(0);
        while(ch!='+'&&ch!='-'&&ch!='*'&&ch!='/'&&ch!='%')
        {
            System.out.println("INVALID CHOICE");
            ch=s.next().charAt(0);
        }
        switch(ch)
        {
            case '+':
            {
                System.out.println("THE SUM IS:"+(a+b));
                break;
            }
            case '-':
            {
                System.out.println("THE SUBTRACTION IS:"+(a-b));
                break;
            }
            case '*':
            {
                System.out.println("THE PRODUCT IS:"+(a*b));
                break;
            }
            case '/':
            {
                System.out.println("THE DIVISION IS:"+(double)(a/b));
                break;
            }
            case '%':
            {
                System.out.println("THE MODULUS IS:"+(a%b));
                break;
            
            }
            default:
            {
                System.out.println("INVALID CHOICE");
            }
        }
    }
}