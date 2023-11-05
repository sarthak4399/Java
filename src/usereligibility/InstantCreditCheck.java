package usereligibility;
import java.util.Scanner;
public class InstantCreditCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Your Salary : ");
        int salary = scanner.nextInt();
        System.out.print(" Enter Your Credit Score : ");
        int Credit_score = scanner.nextInt();
//        user eligibility checking
        isUserEligible(salary,Credit_score);
        isUsereligible(salary,Credit_score);
        notifyUser (isUsereligible(salary,Credit_score));
    }


    public static void isUserEligible(int salary , int Credit_score){
        int required_salary = 20000;
        int required_credit = 1000;
        if( salary >= required_salary && Credit_score >= required_credit){
            System.out.println("Void Method : You are eligible !");
        }
        else {
            System.out.println( "Void Method : You are not eligible !");
        }
    }

    public static boolean isUsereligible(int salary , int Credit_score){
        int required_salary = 20000;
        int required_credit = 1000;
        if( salary >= required_salary && Credit_score >= required_credit){
            System.out.println(" Boolean Method :You are eligible !");
            return true ;
        }
        else {
            System.out.println( " Boolean Method : You are not eligible !");
            return false;
        }

    }
    public static void notifyUser(boolean isUsereligible){
        if (isUsereligible){
            System.out.println( " IS USER BOOLEAN CALLED IN NOTIFY METHOD");
        }
    }
}