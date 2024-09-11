import java.util.*;
public class hashmap
{
    public static void main(String args[])
    {
        HashMap<Integer,String > map=new HashMap<>();
        map.put(1,"Charlie");
        map.put(2,"David");
        map.put(3,"Ethan");
        map.put(4,"Frank");
        map.put(5,"Grace");
        System.out.println(map);

        map.put(2,"John");
        System.out.println(map);

        map.remove(3);
        System.out.println(map);
    }
}