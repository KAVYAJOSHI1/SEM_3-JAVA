//Creating threads using Runnable interface
class MyRunnable implements Runnable{
    public void run()
    {
        System.out.println("Thread is running");
    }
}
public class thread2
{
    public static void main(String args[])
    {
        MyRunnable obj=new MyRunnable();
        Thread t1=new Thread(obj);
        t1.start();
    }
}