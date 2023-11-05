package salespersonsalary;

import java.util.Scanner;

public class SalesPersonSaleryCalculator {
    public static void main (String [] args ) {
        int salery = 10000;
        int quota = 10 ;
        int bonous = 1000 ;
        Scanner scanner = new Scanner(System.in) ;

        System.out.println(" How many sales did the employee make this week ?");
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > quota){
            System.out.println(" Salery is  : " + (salery + bonous));
        }
        else{
            System.out.println(" Good else statement executed ");
        }

    }

}
