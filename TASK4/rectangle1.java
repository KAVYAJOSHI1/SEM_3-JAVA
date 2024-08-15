public class rectangle1 extends shape1
{
    void draw()
    {
        System.out.println("DRAWN RECTANGLE");
    }
    public static void main(String args[])
    {
      shape1 obj;
      obj=new circle1();
      obj.draw();
      obj=new rectangle1();
      obj.draw();
    }
} 
