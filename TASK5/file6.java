/*5. Write a program to demonstrate multithreading using (i) Thread class (ii) Runnable
interface. Display numbers from 1 to 5 with thread name with the sleep interval of 100.
Create three objects and demonstrate multithreading.*/

class MyThread extends Thread{

    public void run(){
        for(int i=0;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public class file6{
        public static void main(String args[])
        {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
      

        t1.setName("Thread 1");
        t1.setName("Thread 2");
        t1.setName("Thread 3");


        t1.start();
        t2.start();
        t3.start();
    }
}
}