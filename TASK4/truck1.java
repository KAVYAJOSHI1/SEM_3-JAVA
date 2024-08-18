public class truck1 extends vehicle1
{
    int capacity;
    truck1(int a,int b,int c)
    {
        super(a,b);
        capacity=c;
    }
    void display()
    {
        super.display();
        System.out.println("NUMBER OF capacity ARE"+capacity);

    }
    public static void main(String args[])
    {
        truck1 obj=new truck1(4,5,400);
        obj.display();
    }
}