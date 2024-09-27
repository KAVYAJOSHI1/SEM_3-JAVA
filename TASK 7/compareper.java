import java.util.*;

public class compareper {
    public static void main(String[] args) {
        // Create an ArrayList and a LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Add elements to both lists
        System.out.println("Adding elements...");
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("Element " + i);
            linkedList.add("Element " + i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList: " + (endTime - startTime) + " nanoseconds");
        System.out.println("LinkedList: " + (endTime - startTime) + " nanoseconds");

        // Remove elements from both lists
        System.out.println("\nRemoving elements...");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(0);
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList: " + (endTime - startTime) + " nanoseconds");
        System.out.println("LinkedList: " + (endTime - startTime) + " nanoseconds");

        // Iterate over elements in both lists
        System.out.println("\nIterating over elements...");
        startTime = System.nanoTime();
        for (String element : arrayList) {
            // do nothing
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList: " + (endTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();
        for (String element : linkedList) {
            // do nothing
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: " + (endTime - startTime) + " nanoseconds");
    }
}