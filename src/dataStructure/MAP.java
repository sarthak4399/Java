package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class MAP {
    public static void main(String[] args) {
        // Creating a Map of Fruits and their Calories
        Map<String, Integer> fruitsCalories = new HashMap<>();
        fruitsCalories.put("Mango", 29);
        fruitsCalories.put("Lemon", 28);
        fruitsCalories.put("Apple", 21);

        // 1. Displaying the original map
        System.out.println("Original Map: " + fruitsCalories);

        // 2. Get the value associated with a specific key
        int caloriesOfApple = fruitsCalories.get("Apple");
        System.out.println("Calories of Apple: " + caloriesOfApple);

        // 3. Check if the map contains a specific key
        boolean containsLemon = fruitsCalories.containsKey("Lemon");
        System.out.println("Does the map contain Lemon? " + containsLemon);

        // 4. Check if the map contains a specific value
        boolean containsCalories28 = fruitsCalories.containsValue(28);
        System.out.println("Does the map contain the value 28? " + containsCalories28);

        // 5. Update the value associated with a key
        fruitsCalories.put("Apple", 25);
        System.out.println("Map after updating calories of Apple: " + fruitsCalories);

        // 6. Remove an entry by key
        fruitsCalories.remove("Mango");
        System.out.println("Map after removing Mango: " + fruitsCalories);

        // 7. Get the size of the map
        int size = fruitsCalories.size();
        System.out.println("Size of the map: " + size);

        // 8. Iterate through the map
        System.out.println("Iterating through the map:");
        for (Map.Entry<String, Integer> entry : fruitsCalories.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " calories");
        }

        // 9. Clear the map
        fruitsCalories.clear();
        System.out.println("Map after clearing: " + fruitsCalories);
    }
}
