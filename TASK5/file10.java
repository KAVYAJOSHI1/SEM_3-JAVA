/*8. Create a Java program that defines a custom thread class. Instantiate and start multiple
instances of this thread to demonstrate concurrent execution.*/

// file10.java
class CustomThread extends Thread {
    private String threadName;

    // Constructor to set the thread name
    CustomThread(String name) {
        threadName = name;
    }

    // Overriding the run method to define the task
    @Override
    public void run() {
        System.out.println(threadName + " is starting.");

        // Simulating some work with a loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                // Sleep for a random time between 100 to 500 milliseconds
                Thread.sleep((int)(Math.random() * 400) + 100);
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }

        System.out.println(threadName + " has finished.");
    }
}

public class file10 {
    public static void main(String[] args) {
        // Creating instances of CustomThread
        CustomThread thread1 = new CustomThread("Thread 1");
        CustomThread thread2 = new CustomThread("Thread 2");
        CustomThread thread3 = new CustomThread("Thread 3");

        // Starting the threads to demonstrate concurrent execution
        thread1.start();
        thread2.start();
        thread3.start();

        // Optional: Wait for all threads to complete before exiting the main method
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All threads have finished execution.");
    }
}
