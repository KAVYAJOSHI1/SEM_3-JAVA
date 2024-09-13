import java.util.LinkedList;
import java.util.Queue;

public class Order {
    String orderId;
    String customerName;
    String orderDate;
    String status;

    // Constructor for the Order class
    public Order(String orderId, String customerName, String orderDate, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.status = status;
    }

    // toString method to display order details
    //to commit
    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName + ", Date: " + orderDate + ", Status: " + status;
    }

    public static void main(String[] args) {
        // Create a Queue to store orders
        Queue<Order> orderQueue = new LinkedList<>();

        // Task 1: Add 4 new orders to the queue
        orderQueue.add(new Order("001", "Alice", "2024-09-12", "pending"));
        orderQueue.add(new Order("002", "Bob", "2024-09-12", "completed"));
        orderQueue.add(new Order("003", "Charlie", "2024-09-13", "pending"));
        orderQueue.add(new Order("004", "David", "2024-09-13", "completed"));

        // Display all orders in the queue
        System.out.println("All orders in the queue:");
        for (Order order : orderQueue) {
            System.out.println(order);
        }

        // Task 2: Remove orders with status "completed"
        orderQueue.removeIf(order -> order.status.equals("completed"));

        // Display the order queue after removing completed orders
        System.out.println("\nAfter removing completed orders:");
        for (Order order : orderQueue) {
            System.out.println(order);
        }

        // Task 3: Display current pending orders
        System.out.println("\nPending orders:");
        for (Order order : orderQueue) {
            if (order.status.equals("pending")) {
                System.out.println(order);
            }
        }
    }
}
