public class washingmachine extends Appliance
{
    int price;
    String name;
    washingmachine(String a,int b,int c,String d)
    {
        super(a,b);
        price=c;
        name=d;
    }
    void display()
    {
        super.display();
        System.out.println("PRICE IS : "+price);
        System.out.println("NAME IS :"+ name);
    }
    public static void main(String args[])
    {
        washingmachine obj=new washingmachine("HAEIR",40,20000,"A23S");
        obj.display();
    }
}