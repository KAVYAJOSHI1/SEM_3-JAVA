import java.util.*;
public class treeset
{
    public static void main(String args[])
    {
        TreeSet<Integer> t=new TreeSet<>();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        t.add(50);
        System.out.println(t);
        
       
        System.out.println( t.descendingSet());

        System.out.println("The first element is:"+t.first());
        System.out.println("The last element is:"+t.last());

        t.pollFirst();
        System.out.println(t);

        t.add(60);
        t.add(70);
        System.out.println("Size of tree set is:"+ t.size());
    }
}