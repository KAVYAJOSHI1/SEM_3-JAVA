//USE OF CONSTRUCTOR IN THREAD
class MyThread extends Thread{
    public MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("I AM A THREAD");
    }
}
public class thread4
{
    public static void main(String args[])
    {
    MyThread t1=new MyThread("FIRST");
    t1.start();
    System.out.println("ID OF THE THREAD IS "+t1.getId());
    System.out.println("NAME OF THE THREAD IS "+t1.getName());
    }
}