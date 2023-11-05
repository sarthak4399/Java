package dataStructure;
import  java.util.HashSet;
import java.util.Set ;

public class SET {
//    1.SET 2.QUEUE  3.LIST 4.MAP
        public static  void main(String [] args ){

            Set Fruit = new HashSet();
            Fruit.add("appal");
            Fruit.add("banana");
            Fruit.add("No");


            System.out.println(Fruit);

            System.out.println("Have a Lemon ? "+Fruit.contains("Lemon"));

            Set Fruits = Set.of("Strawberry","Mango","appal","Oranges");

            System.out.println(Fruits);

        }







}
