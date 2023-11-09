package exception_handling;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

//try catch block
//exceptions are the errors that occur during the execution of the program > checked and unchecked
//checked exceptions are the exceptions that are checked at compile time
//unchecked exceptions are the exceptions that are checked at runtime

public class exception_handling {
    public static void main(String[] args) {
        File file = new File("/Users/sarthakkhandare/IdeaProjects/java_essentials/src/Main.java");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("After Scanner File Found !");
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + "Msg : " + e.getMessage() + "StackTrace : " + e.getStackTrace());
        }
        System.out.println("After try catch");

//     More than one exception using the polymorphism concept
//        hirehchy of the exceptions
//        Throwable > Exception > IOException > FileNotFoundException


        try {
            int a = 1;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " occurred, please check your code.");
        } catch (Exception e) {
            System.out.println("Generic Exception occurred, please check your code.");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
//        finaly block
//        finally block is always executed whether exception is handled or not
//        finally block is used to release the resources like database connection, file connection etc.
//        finally block is used to execute important code such as closing connection, stream etc.
//        finally block is used to execute code even if exception occurs
//        finally block is always executed after try and catch block


//        try with resources
//        try with resources is a feature of java 7
//        try with resources is used to automatically close the resources used in the program
//        try with resources is used to close the connection, stream etc.
//        try with resources is used to avoid the use of finally block
//        try with resources is used to avoid the use of catch block
//        try with resources is used to avoid the use of close() method
//        try with resources is used to avoid the use of flush() method
//        try with resources is used to avoid the use of connection.close() method
//        try with resources is used to avoid the use of stream.close() method