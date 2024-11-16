public class child extends parent
{
    child(String a)
    {
      super(a);
    }
    void display()
    {
        System.out.println("NAME IS :"+name);

    }
    public static void main(String args[])
    {
        parent obj;
        obj= new child("kavya");
        obj.display();
    }
}