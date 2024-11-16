import java.util.*;
interface playable
{
    void play();
}
interface readable
{
 void read();
}
class ebook implements playable ,readable
{
    String title,author;
    public void play()
    {
        System.out.println("PLAYED");
    }
    public void read()
    {
        System.out.println("READED");
    }
    public static void main(String args[])
    {
    ebook obj=new ebook();
    obj.play();
    obj.read();
    }
} 