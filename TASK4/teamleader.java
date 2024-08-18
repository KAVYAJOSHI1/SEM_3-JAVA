public class teamleader extends manager
{
    int teamsize;
    teamleader(String a,int b,String c,int d)
    {
        super(a,b,c);
        teamsize=d;
    }
    void display()
    {
        super.display();
        System.out.println("TEAM SIZE IS "+teamsize);

    }
    public static void main(String args[])
    {
        teamleader obj=new teamleader("VRUND",5,"SALES",0);
        obj.display(); 
    }
}