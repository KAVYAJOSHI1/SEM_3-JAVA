import java.util.*;
public class team
{
    public static void main(String args[])
    {
        Set<String> set =new LinkedHashSet<>();
        set.add("Rohan");
        set.add("Sohan");
        set.add("Rohit");
        set.add("Sohit");
        set.add("Rahul");
        set.add("Sahul");

       

        set.remove("Rahul");

        System.out.println("Team members after adding players :"+ set);


    }
}