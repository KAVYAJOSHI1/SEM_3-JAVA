public class Cat extends Animal
{
    Cat(String a)
    {
        super(a);
    }
    void display()
    {
        super.makesound();
    }
    public static void main(String args[])
    {
        Cat obj=new Cat("MEOW");
        obj.display();
    }
}