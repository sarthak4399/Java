package interfaces;

public class Library {

    public  static void main ( String [] args) {

        Product book = new Book();
        book.setName("I like YOu !") ;
        book.setPrice(100000000);

        Product book2 = new Book();

        book.getName();
        book.getPrice();

    }



}
