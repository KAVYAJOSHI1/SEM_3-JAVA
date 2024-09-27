/*5. Write a program to create multiple threads that print numbers from 1 to 10. Demonstrate thread
priorities and thread states.*/

class MyThread extends Thread
{
    String name;
    public MyThread(String name)
    {
        this.name=name;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(name+" : "+i);
        }
    }
}
public class thread7
{
    public static void main(String args[])
    {
        MyThread t1=new MyThread("FIRST");
        MyThread t2=new MyThread("SECOND");
        MyThread t3=new MyThread("THIRD");
        t1.start();
        t2.start();
        t3.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
    }
}