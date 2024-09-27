import java.util.*;

public class map {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        System.out.println("HashMap:");
        insertAndUpdate(hashMap);
        retrieve(hashMap);

        // Create a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("\nTreeMap:");
        insertAndUpdate(treeMap);
        retrieve(treeMap);
    }

    public static void insertAndUpdate(Map<String, Integer> map) {
        // Insert key-value pairs
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        // Update a key-value pair
        map.put("John", 26);

        // Print the map
        System.out.println("Map: " + map);
    }

    public static void retrieve(Map<String, Integer> map) {
        // Retrieve a value by key
        System.out.println("Value for key 'John': " + map.get("John"));

        // Check if a key exists
        System.out.println("Does key 'Alice' exist? " + map.containsKey("Alice"));

        // Check if a value exists
        System.out.println("Does value 35 exist? " + map.containsValue(35));
    }
}