//thread methods
//JOIN METHOD
//INTERRUPT METHOD
class MyThread extends Thread{
    public MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("I AM A THREAD"+this.getName());
    }
}
class NewThread extends Thread{
    public NewThread(String name)
    {
        super(name);
    }
    public void run()
    {
        for(int i=0;i<10;i++)
        {
        System.out.println("I AM A NEW THREAD "+this.getName());
    }
}
}
public class thread6
{
    public static void main(String args[])
    {
    NewThread t1=new NewThread("FIRST");
    NewThread t2=new NewThread("SECOND");

    t1.start();
    try{
        //t1.join();
        Thread.sleep(1000);
    }
    catch(Exception e)
    {
        System.out.println("Exception caught "+e);
    }
    
    t2.start();

    
    }
}