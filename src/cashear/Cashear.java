package cashear;

import java.util.Scanner;

public class Cashear {
    public static void main (String [] args ) {
            System.out.println(" Enter the number od items to scan ");
            Scanner scanner = new Scanner(System.in) ;
            int qnty = scanner.nextInt();
            double total =0 ;
            for (int i = 0 ; i< qnty ; i++){
                System.out.println("Enter the cost of item " + i + ": ");
                double price = scanner.nextDouble() ;
                total = total + price   ;

            }
            scanner.close();
            System.out.println(" Your Total is $" + total);
    }
}
