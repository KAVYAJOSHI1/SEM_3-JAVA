public class Ebook extends readable
{
    String title;
    String author;
    Ebook(String a,String b)
    {
        title=a;
        author=b;
    }
    void display()
    {
        System.out.println("AUTHOR IS "+author);
        System.out.println("TITLE IS "+title);
    }
    public static void main(String args[])
    {
        Ebook obj=new Ebook("YUG","ELECTRICS");
        obj.display();
        obj.read();
        obj.play();
    }
}