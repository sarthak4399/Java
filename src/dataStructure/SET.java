package dataStructure;

import java.util.HashSet;
import java.util.Set;

public class SET {
    public static void main(String[] args) {
        // Creating a Set of Fruits
        Set<String> fruitsSet = new HashSet<>();

        // 1. Adding elements to the set
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Mango");

        // 2. Displaying the original set
        System.out.println("Original Set: " + fruitsSet);

        // 3. Checking if the set contains a specific element
        System.out.println("Does the set contain 'Lemon'? " + fruitsSet.contains("Lemon"));

        // 4. Getting the size of the set
        System.out.println("Size of the set: " + fruitsSet.size());

        // 5. Removing an element from the set
        fruitsSet.remove("Mango");
        System.out.println("Set after removing 'Mango': " + fruitsSet);

        // 6. Checking the size again after removal
        System.out.println("Size of the set after removal: " + fruitsSet.size());

        // 7. Iterating through the set
        System.out.println("Iterating through the set:");
        for (String fruit : fruitsSet) {
            System.out.println(fruit);
        }

        // 8. Clearing the set
        fruitsSet.clear();
        System.out.println("Set after clearing: " + fruitsSet);
    }
}
