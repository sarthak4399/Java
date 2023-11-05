package gross_calculator;
import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String [] args){
//        System.out.println("How many Hours did you work ? ");
//        Scanner scanner = new Scanner(System.in);
////        1 Get the  number of working hours
//            int hours = 0 ;
//            hours = scanner.nextInt();
////        2 get hourly work pay
//        System.out.println("Pay Rate ");
//            int pay_rate = 0 ;
//            pay_rate =  scanner.nextInt();
//
////        3 multiply the hours with pay rate
//            int gross_pay = hours * pay_rate ;
//
//
////        4 Display result
//        System.out.println("Gross Pay = " + gross_pay);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a Adjective ");
        String adjective = scanner.next();
        System.out.println("Season Of the year ");
        String Season = scanner.next() ;
        System.out.println("Whole Number ");
        int Whole_num = scanner.nextInt();
        System.out.println("on a(n) " + adjective+" "+ Season + " day ,I drank a minimum " + Whole_num + " cup of coffe ! " );
    }

}
