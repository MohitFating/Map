import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 15);

        // Access values using keys
        int appleQuantity = map.get("Apple");
        System.out.println("Quantity of Apples: " + appleQuantity);

        // Check if a key exists in the map
        boolean containsKey = map.containsKey("Banana");
        System.out.println("Contains Banana: " + containsKey);

        // Update the value associated with a key
        map.put("Banana", 30);
        System.out.println("Updated Quantity of Bananas: " + map.get("Banana"));

        // Remove a key-value pair from the map
        map.remove("Orange");

        // Iterate over the keys in the map
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + ": " + value);
        }

        // Check the size of the map
        int size = map.size();
        System.out.println("Map Size: " + size);

        // Clear the map
        map.clear();

        // Check if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Map is Empty: " + isEmpty);
    }
}
