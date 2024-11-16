public class manager extends empoy
{
    protected String department;
    manager(String a,String b,String c)
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