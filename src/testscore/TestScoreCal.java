package testscore;

import java.util.Scanner;

public class TestScoreCal {
    public static void main (String[] args ){

        System.out.println("Enter Student Name ") ;
        Scanner scanner  = new Scanner(System.in) ;
        String studentName = scanner.next() ;
        System.out.println( " Enter the Marks of "+ studentName + " To Get the Grades ");
        int marks = scanner.nextInt();
        if (marks>90){
            System.out.println(" Your Grade is : " + " A");
        } else if (marks>50) {
            System.out.println(" Your Grade is : " + " B");
            
        } else if (marks <=40 && marks>=25 ) {
            System.out.println(" Your Grade is : " + " C");

        }
        else {
            System.out.println(" Your Grade is : " + " F (Fail) ");
        }
    }

}
