package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class LIST {
    public static void main(String[] args) {
        // Creating a List of Fruits
        List<String> fruits = new ArrayList<>();
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Oranges");
        fruits.add("Apple");

        // Displaying the original list
        System.out.println("Original List: " + fruits);

        // 1. Add an element at a specific index
        fruits.add(2, "Banana");
        System.out.println("List after adding Banana at index 2: " + fruits);

        // 2. Remove an element by value
        fruits.remove("Mango");
        System.out.println("List after removing Mango: " + fruits);

        // 3. Get an element by index
        String fruitAtIndex3 = fruits.get(3);
        System.out.println("Fruit at index 3: " + fruitAtIndex3);

        // 4. Check if the list contains a specific element
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Does the list contain Apple? " + containsApple);

        // 5. Get the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        // 6. Iterate through the list
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 7. Clear the list
        fruits.clear();
        System.out.println("List after clearing: " + fruits);
    }
}
