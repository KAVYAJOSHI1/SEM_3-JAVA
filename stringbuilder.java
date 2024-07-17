import java.util.*;

public class stringbuilder {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println("Initial capacity: " + builder.capacity());
        for (int i = 0; i < 1000; i++) {
            builder.append("World");
        }
        System.out.println("Time taken by string builder: " + (System.currentTimeMillis() - start) + " ms");
    }
}
