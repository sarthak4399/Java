package grade_msg;

import java.util.Scanner;

public class gradeMsg {
    public static void main(String [ ] arg ){
        System.out.println(" Enter You Grade Letter ( A , B , C, F ) ");
        Scanner scanner  = new Scanner(System.in) ;
        String grade = scanner.next();
        scanner.close();
//        Method 1
//        String message ;
//        switch(grade){
//            case " A":
//                message=" Nice Work ";
//                break;
//            case " B":
//                message= "Try Hard To score A NiceWork !";
//                break;
//            case " C ":
//                message= " Score is Average ";
//                break;
//            case "F":
//                message=" You are failed Try Harder ";
//                break;
//        }

//      Method 2
        String message =switch(grade){
            case " A" -> " Nice Work ";
            case " B" -> " Try Hard To score A NiceWork !";
            case " C" -> " Score is Average ";
            case " F" -> " You are failed Try Harder ";
            default -> " Error invalid grade ";
        } ;

/*
*   Switch Statement and switch expressions
*
* */
    }

}
