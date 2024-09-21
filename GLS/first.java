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
public class first{
public static void main(String args[])
{
    MyThreads1 t1=new MyThreads1();
    MyThreads2 t2=new MyThreads2();
    t1.start();
    t2.start();
}

}