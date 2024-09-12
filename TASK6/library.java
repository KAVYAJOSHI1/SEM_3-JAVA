import java.util.*;
class Book{
    String title;
    boolean isAvailable;
    Book(String title,boolean isAvailable)
    {
        this.title=title;
        this.isAvailable=isAvailable;
    }

    @Override
    public String toString() {
        return title+" "+isAvailable;
    }
}
public class library
{
    public static void main(String args[])
    {
        HashSet<Book> set=new HashSet<>();
        set.add(new Book("One",true));
        set.add(new Book("Two",false));
        set.add(new Book("Three",true));
        set.add(new Book("Four",false));
        set.add(new Book("Five",true));

        set.removeIf(book -> book.title.equals("Two"));

        boolean isAlienAvailable =set.stream().anyMatch(book -> book.title.equals("ALien") && book.isAvailable);
        System.out.println(isAlienAvailable);

        System.out.println("Available books");
        set.stream().filter(book -> book.isAvailable).forEach(book -> System.out.println(book.title));
    }
}