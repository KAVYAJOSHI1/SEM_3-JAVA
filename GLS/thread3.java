//Synchronize threads using join by try catch

class  Counter
{
    int count=0;
    public synchronized void increment()
    {
        count++;
    }

    public int getCount()
    {
        return count; 
    }
}

public class thread3
{
    public static void main(String args[]) throws InterruptedException
    {
        Counter c=new Counter();

        Thread t1=new Thread(() -> {
            for(int i=0;i<100;i++)
            {
                c.increment();
            }
        });

        Thread t2=new Thread(() -> {
            for(int i=0;i<100;i++)
            {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("FINAL COUNT: "+c.getCount());  
      }
}