package functionalprograming;
import java.util.*;
import java.util.concurrent.Callable;

public class Functional_Interfaces {
    public static void main(String[] args) {
//        // Example 1: Using a lambda expression to implement the Comparator interface
        Comparator<String> stringLengthComparator = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 0;
            }
        };
        // Example 2: Using a lambda expression to implement the Runnable interface
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello World from thread [" + Thread.currentThread().getName() + "]");
            }
        };
        // Example 3: Using a lambda expression to implement the Callable interface
        Callable<Integer> callable = () -> {
            return new Random().nextInt(100);
        };
    }
}