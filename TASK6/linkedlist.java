import java.util.*;
public class linkedlist
{
    public static void main(String args[])
    {
        LinkedList<Integer> list =new LinkedList<>();
        
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        list.add(0,10);
        System.out.println(list);

        list.add(6,70);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}