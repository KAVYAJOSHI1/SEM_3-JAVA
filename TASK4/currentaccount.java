public class currentaccount extends bankaccount
{
    double interest;
    currentaccount(int a ,int b,double c)
    {
        super(a,b);
        interest=c;
    }

    void display()
    {
        super.display();
        System.out.println("INTEREST IS:"+ interest);

    }

public static void main(String args[])
{
    currentaccount obj=new currentaccount(5,54866,5);
    obj.display();

}
}