package vehicle;

import inheritance.Coupe;

public class Garage {
    public static  void main (String [] args){
        Coupe mycars =new Coupe();
        mycars.setColor("CYAN");

        System.out.println(String.format("My blank car is %s and has %d doors " ,mycars.getColor() ,mycars.getDoors()));
        mycars.setMileage(29);
        System.out.print(String.format(" mileage of my Car is %d" , mycars.getMileage()));
    }

}
