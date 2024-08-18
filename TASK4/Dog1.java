public class Dog1 extends Animal1
{
    String breed;
    Dog1(String a,int b,String c)
    {
        super(a,b);
        breed=c;

    }
    void display()
    {
        super.display();
        System.out.println("BREED IS :"+breed);
    }
    public static void main(String args[])
    {
        Dog1 obj=new Dog1("DOG",4,"DOBER-MAN");
        obj.display();
    }
}