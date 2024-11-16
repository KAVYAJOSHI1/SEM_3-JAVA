public class teamlead extends manager
{
    protected int size;
    teamlead(String a,String b,String c,int d)
    {
        super(a,b,c);
        size=d;
    }
    void display()
    {
        super.display();
        System.out.println("SIZE IS "+size);
    }
    
}