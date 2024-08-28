//using runnable interface
class MyRunnable implements Runnable {
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class file7 {
    public static void main(String[] args) {
        // Creating instances of the Runnable implementation
        MyRunnable runnable = new MyRunnable();

        // Creating Thread objects and passing the Runnable instances
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        // Setting thread names
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
    }
}

