public class car1 extends vehicle1
{
    int doors;
    car1(int a,int b,int c)
    {
        super(a,b);
        doors=c;
    }
    void display()
    {
        super.display();
        System.out.println("NUMBER OF DOORS ARE"+doors);

    }
    public static void main(String args[])
    {
        car1 obj=new car1(4,5,4);
        obj.display();
    }
}