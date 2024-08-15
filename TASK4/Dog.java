public class Dog extends Animal
{
    Dog(String a)
    {
        super(a);
    }
    void display()
    {
        super.makesound();
    }
    public static void main(String args[])
    {
        Dog obj=new Dog("BARK");
        obj.display();
    }
}