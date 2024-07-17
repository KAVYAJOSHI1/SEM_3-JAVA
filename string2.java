import java.util.*;

public class string2 {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Initial capacity: " + buffer.capacity());
        for (int i = 0; i < 1000; i++) {
            buffer.append("World");
        }
        System.out.println("Time taken by string buffer: " + (System.currentTimeMillis() - start) + " ms");
    }
}
