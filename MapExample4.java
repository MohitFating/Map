import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Access values using keys
        System.out.println("Age of Alice: " + map.get("Alice"));

        // Check if a key exists
        if (map.containsKey("Bob")) {
            System.out.println("Bob is present in the map");
        }

        // Iterate over the keys and values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Remove a key-value pair
        map.remove("Charlie");
        System.out.println("After removing Charlie: " + map);
    }
}
