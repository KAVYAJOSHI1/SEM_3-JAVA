import java.util.*;
public class Game
{
    protected String title;
    protected String genre;
    Game(String a,String b)
    {
        title=a;
        genre=b;
    }
    void display()
    {
        System.out.println("TITLE IS : "+title);
        System.out.println("GENRE IS :"+ genre);
    }
    
}