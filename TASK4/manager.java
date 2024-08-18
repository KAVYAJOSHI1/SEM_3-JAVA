public class manager extends employee1
{
    String department;
    manager(String a,int b,String c)
    {
        super(a,b);
        department=c;
    }
    void display()

    {
        super.display();
        System.out.println("DEPARTMENT IS "+department);
    }

}