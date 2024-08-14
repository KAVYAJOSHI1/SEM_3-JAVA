public class car extends vehicle
{
    String name;
    int price;
    car(int a,int b,String c,int d)
    {
      super(a,b);
      name=c;
      price=d;
    }
    void display()
    {
        super.display();
        System.out.println("NAME IS:"+ name);
        System.out.println("PRICE IS:"+price);
    }
    public static void main(String args[])
    {
        car obj=new car(50,40,"VOLVO",6598665);
        obj.display();
    }
}