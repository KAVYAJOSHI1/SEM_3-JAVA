//to set priority 
//program to print goodmorning and welcome continuously on teh screen using threads
//To get state of the thread
//reference to curent thread in java
class MyThreads1 extends Thread
{
    public void run()
    {
        int i=2;
        while(i<5)
        {
            i++;
        System.out.println("Good Morning");
        }
    }
}

class MyThreads2 extends Thread{
    public void run()
    {
     
        System.out.println("Good Afternoon");
      
    }
}
public class third{
public static void main(String args[])
{
    MyThreads1 t1=new MyThreads1();
    t1.setPriority(1);
    MyThreads2 t2=new MyThreads2();
    t2.setPriority(5);
    System.out.println(t2.getState());
    System.out.println(t1.getState());
    t1.start();
    t2.start();
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());
    System.out.println(t2.getState());
    System.out.println(t1.getState());
    System.out.println(Thread.currentThread().getState());

}

}