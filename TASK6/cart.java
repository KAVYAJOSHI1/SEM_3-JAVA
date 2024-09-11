import java.util.*;
public class cart{
    public static void main(String args[])
    {
      HashMap<String,Integer> map=new HashMap<>();
      map.put("Soap",50);
      map.put("Shampoo",100);
      map.put("Toothpaste",20);
      map.put("Toothbrush",10);
      System.out.println(map);

      map.remove("Shampoo");
      System.out.println(map);

      for(Map.Entry<String,Integer>entry:map.entrySet())
      {
      System.out.println("Item :"+entry.getKey()+" , Quantity :"+entry.getValue());
      }

      int totalquantity=0;
      for(int quantity: map.values())
      {
      totalquantity+=quantity;
      }
      System.out.println("Total Quantity:"+totalquantity);
    }
}