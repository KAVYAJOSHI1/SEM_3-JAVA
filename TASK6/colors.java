import java.util.*;
public class colors
{
    public static void main(String args[])
    {
        ArrayList<String> list =new ArrayList<>();
        list.add("RED");
        list.add("GREEN");
        list.add("BLUE");
        System.out.println(list);

        list.add(1,"BROWN");
        System.out.println(list);

        list.remove("GREEN");
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
