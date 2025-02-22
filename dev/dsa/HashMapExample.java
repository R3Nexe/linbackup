import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();
        
        // Inserting key-value pairs
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        
        // Accessing a value
        int count = map.get("Banana");
        System.out.println("Count for Banana: " + count);
        
        // Check if a key exists
        if (map.containsKey("Apple")) {
            System.out.println("Apple is in the map.");
        }
        
        // Removing a key-value pair
        map.remove("Orange");
        
        // Iterating over keys
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
        
        // Iterating over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        
        // Check the size of the map
        System.out.println("Map size: " + map.size());
        
        // Clear the map
        map.clear();
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
