package Strings;

public class CountWords {
    public static void main ( String [] args){
    CountWord("Hello Sarthak You are so nice ");
    reverseString("Hello Sarthak You are so nice  ");
    }
    public static  void CountWord(String text){
        String [ ] Word = text.split(" ");
        int numberOfWord = Word.length;
        String message = String.format(" you String Contains %d",numberOfWord);
        System.out.print(message
        );
    }


    public static  void reverseString(String text){
        for( int i =text.length()-1;i>=0;i--) {
            System.out.println(text.charAt(i));
        }
    }
}
