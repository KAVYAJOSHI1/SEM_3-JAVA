//To modify first one by adding sleep of 200 ms
class MyThreads1 extends Thread
{
    public void run()
    {
        while(true)
        {
            try{
            Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        System.out.println("Good Morning");
        }
    }
}

class MyThreads2 extends Thread{
    public void run()
    {
        while(true)
        {
            try{
                Thread.sleep(200);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            
        System.out.println("Good Afternoon");
        }
    }
}
public class second{
public static void main(String args[])
{
    MyThreads1 t1=new MyThreads1();
    MyThreads2 t2=new MyThreads2();
    t1.start();
    t2.start();
}

}