package averagetestscores;

import java.util.Scanner;

public class AverageTestScores {
    public static void main ( String [] arg){
        int Tol_num_student =24 ;
        int Tol_test=4;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i< Tol_num_student ;i ++){
            double total =0 ;

            for (int j= 0 ; j < Tol_test ; j++){
                System.out.println(" Enter the the student Score for test # "+ (j+1));
                double score = scanner.nextDouble();
                total = total+score;
            }
            double avg = total/Tol_test;
            System.out.println(" Test Average For Student "+ ( i+1)+  avg);
        }
    }

}
