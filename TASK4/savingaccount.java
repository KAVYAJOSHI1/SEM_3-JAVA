public class savingaccount extends bankaccount
{
    double interest;
    savingaccount(int a ,int b,double c)
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
    savingaccount obj=new savingaccount(5,54866,5);
    obj.display();

}
}