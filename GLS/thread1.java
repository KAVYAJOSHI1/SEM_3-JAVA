//Creating threads using Thread class
class MyThread extends Thread{

    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " running");
        System.out.println(name + " executing");
        System.out.println(name + " ended");
    }
}

public class thread1
{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}