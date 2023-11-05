package storeemployee;

import java.util.Scanner;

public class grossPayValidator {
    public static  void main (String [ ] arg){
        int maxHours = 40 ;
        int payRate = 25 ;

        System.out.println(" Enter Number of hours emmployee worked ");
        Scanner scanner = new Scanner(System.in);
        double workHours = scanner.nextDouble();
        while( workHours > maxHours){
            System.out.println("Invalid Your Hours must be between 1 to 40 ");
             workHours = scanner.nextDouble();
        }
        double grossPay= workHours*payRate ;
        System.out.println(" Gross Pay is " +grossPay);
    }
}
