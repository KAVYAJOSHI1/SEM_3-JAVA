public class Videogame extends Game
{
    int size;
    int players;
    Videogame(String a,String b,int c,int d)
    {
        super(a,b);
        size=c;
        players=d;
    }
    void display()
    {
        super.display();
        System.out.println("SIZE IS :"+ size);
        System.out.println("PLAYERS ARE:"+ players);
    }
    public static void main(String args[])
    {
        Videogame obj=new Videogame("CLASH OF CLANS","FIGHT",40,500000);
        obj.display();
    }
}