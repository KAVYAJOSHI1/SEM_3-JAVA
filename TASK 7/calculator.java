public class calculator
{
    public static void main(String args[])
    {
        calcim obj=new calcim();
        double n1=5;
        double n2=10;

        System.out.println("Addition:"+obj.add(n1,n2));
        System.out.println("Subtraction:"+obj.sub(n1,n2));
        System.out.println("Multiplication:"+obj.mul(n1,n2));
        System.out.println("Division:"+obj.div(n1,n2));
        
    }
}