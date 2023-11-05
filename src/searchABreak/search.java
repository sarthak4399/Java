package searchABreak;
import  java.util.Scanner ;
public class search {
    public static void main ( String [] arg){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        boolean letterfound = false ;
        for(int i =0 ; i < text.length(); i++){
            char current_letter = text.charAt(i);
            if(current_letter == 'A' || current_letter == 'a'){
                letterfound=true;
                break;
            }

        }
        if (letterfound) {
            System.out.println("Letter A found!");
        } else {
            System.out.println("Letter A not found.");
        }
    }
}
