import java.util.*;

public class collection{
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("ArrayList:");
        addElements(arrayList);
        displayElements(arrayList);

        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("\nHashSet:");
        addElements(hashSet);
        displayElements(hashSet);

        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("\nTreeSet:");
        addElements(treeSet);
        displayElements(treeSet);
    }

    public static void addElements(Collection<String> collection) {
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");
        collection.add("Date");


        
        collection.add("Elderberry");
        collection.add("Fig");
        collection.add("Grape");
        collection.add("Apple"); // duplicate element
    }

    public static void displayElements(Collection<String> collection) {
        for (String element : collection) {
            System.out.println(element);
        }
    }
}