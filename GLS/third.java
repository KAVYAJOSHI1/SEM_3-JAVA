//to set priority 
//program to print goodmorning and welcome continuously on teh screen using threads
class MyThreads1 extends Thread
{
    public void run()
    {
        while(true)
        {
        System.out.println("Good Morning");
        }
    }
}

class MyThreads2 extends Thread{
    public void run()
    {
        while(true)
        {
        System.out.println("Good Afternoon");
        }
    }
}
public class third{
public static void main(String args[])
{
    MyThreads1 t1=new MyThreads1();
    t1.setPriority(1);
    MyThreads2 t2=new MyThreads2();
    t2.setPriority(5);
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());
    t1.start();
    t2.start();
}

}