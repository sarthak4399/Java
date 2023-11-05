package greatings;

import java.util.Scanner;

public class Greatings {
    public static void main(String args[]){
        Mission();
    }
    public static void Mission( ){
        System.out.print( " Hello There Enter Your Name : ");
        Scanner scanner = new Scanner( System.in) ;
        String name = scanner.next();
        System.out.println("You Have Mission If You Accept It "+ name +".");
    }

}
