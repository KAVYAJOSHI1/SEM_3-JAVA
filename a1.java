import java.util.*;
public class a1 extends a
{
   public   a1(int o,int h)
   {
    super(o,h);
   }
   void display()
   {
    System.out.println("AREA OF RECTANGLE IS :"+ ans);
   }
   public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER VALUES");
    int k,l;
    k=s.nextInt();
    l=s.nextInt();
    a1 obj=new a1(k,l);
    obj.area();
    obj.display();

   }
}