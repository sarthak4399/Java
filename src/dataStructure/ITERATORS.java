package dataStructure;

import java.util.*;

public class ITERATORS {
    public static void main(String[] args) {
        // Example with List and Iterator
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Mango");

        System.out.println("List Iterator:");
        Iterator<String> listIterator = fruitsList.iterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        // Example with Set and Iterator
        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Mango");

        System.out.println("\nSet Iterator:");
        Iterator<String> setIterator = fruitsSet.iterator();
        while (setIterator.hasNext()) {
            String fruit = setIterator.next();
            System.out.println(fruit);
        }
        var i  = fruitsSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
//        enhanced for loop
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        for (String fruit : fruitsSet) {
            System.out.println(fruit);
        }
        
        System.out.println("For each: ");
        for (String s : fruitsList) {
            System.out.println(s);
        }

        fruitsSet.forEach(System.out::println);

        // Example with Map and Iterator (using keySet)
        // Note: Maps don't directly use Iterators, but you can iterate over keySet, values, or entrySet.
        Map<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("Apple", 10);
        fruitsMap.put("Banana", 5);
        fruitsMap.put("Mango", 8);

        System.out.println("\nMap Iterator:");
        Iterator<String> mapIterator = fruitsMap.keySet().iterator();
        while (mapIterator.hasNext()) {
            String fruit = mapIterator.next();
            System.out.println(fruit + ": " + fruitsMap.get(fruit));
        }
        fruitsMap.forEach((k,v)-> System.out.println("Fruit:"+k + " ::" +"Qty"+v));



    }
}
