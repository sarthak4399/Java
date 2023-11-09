package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QUEUE {
    public static void main(String[] args) {
        // Creating a Queue of Fruits
        Queue<String> fruitsQueue = new LinkedList<>();

        // 1. Adding elements to the queue
        fruitsQueue.add("Fr1");
        fruitsQueue.add("Fr2");
        fruitsQueue.add("Fr3");
        fruitsQueue.add("Fr4");

        // 2. Displaying the original queue
        System.out.println("Original Queue: " + fruitsQueue);

        // 3. Checking if the queue contains a specific element
        System.out.println("Does the queue contain 'F5'? " + fruitsQueue.contains("F5"));

        // 4. Getting the size of the queue
        System.out.println("Size of the queue: " + fruitsQueue.size());

        // 5. Removing an element from the queue
        fruitsQueue.remove("Fr4");
        System.out.println("Queue after removing 'Fr4': " + fruitsQueue);

        // 6. Checking the size again after removal
        System.out.println("Size of the queue after removal: " + fruitsQueue.size());

        // 7. Polling (removing and returning) the front element of the queue
        String frontElement = fruitsQueue.poll();
        System.out.println("Removed front element: " + frontElement);
        System.out.println("Queue after polling: " + fruitsQueue);

        // 8. Peeking (retrieving without removing) the front element of the queue
        String frontElementPeek = fruitsQueue.peek();
        System.out.println("Front element without removal: " + frontElementPeek);

        // 9. Clearing the queue
        fruitsQueue.clear();
        System.out.println("Queue after clearing: " + fruitsQueue);
    }
}
