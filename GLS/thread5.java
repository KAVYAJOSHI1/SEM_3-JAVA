//Creating thread priorities


class MyThread extends Thread{
    public MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("I AM A THREAD "+this.getName());
    }
}
public class thread5
{
    public static void main(String args[])
    {
    MyThread t1=new MyThread("FIRST");
    MyThread t2=new MyThread("SECOND");
    MyThread t3=new MyThread("THIRD");
    MyThread t4=new MyThread("FOURTH");
    MyThread t5=new MyThread("FIFTH");
    t5.setPriority(Thread.MAX_PRIORITY);
    t1.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    }
}