import java.util.*;
public class bankaccount
{
    int accountno;
    int balance;
    bankaccount(int a,int b)
    {
        accountno=a;
        balance=b;
    }
    void display()
    {
        System.out.println("ACCOIUNT NUMBER IS:"+ accountno);
        System.out.println("BALANCE IS :"+ balance);
    }
    
}