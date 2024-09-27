//PRODUCER CONSUMER PROBLEM
class SharedResource {
    private int data = 0;
    private boolean available = false;

    public synchronized void produce(int data) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = data;
        available = true;
        notify();
    }

    public synchronized int consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        int data = this.data;
        available = false;
        notify();
        return data;
    }
}

public class thread8 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedResource.produce(i);
                System.out.println("Produced: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                int data = sharedResource.consume();
                System.out.println("Consumed: " + data);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}