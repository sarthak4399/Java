package addnumbers;

import java.util.Scanner;

public class AddNumbers {
    public static void main ( String[ ] arg) {
        Scanner scanner = new Scanner (System.in) ;
        int runAgain = 0 ;
        do{
            System.out.println("Enter Numbers to add ") ;
            System.out.print("First Number =");
            int First_num = scanner.nextInt();
            System.out.print( "Second Number =");
            int Second_num = scanner.nextInt();
            double sum = First_num + Second_num ;
            System.out.println(" Sum is = " + sum);
            System.out.println(" Do You Want to Run again  Press 1 For Yes 0 For No");
            int checkFlag = scanner.nextInt();
            if ( checkFlag == 1 ){
                runAgain = 1 ;
            }
            else{
                runAgain =0;
            }
        }while (runAgain==1);
    }
}
