package rollthedie;

import java.util.Random;

public class RollTheDie {
    public static void main (String[] arg){
       int maxRolls = 5;
       int currentSpace= 0;
       int maxSpace = 20 ;
       Random random = new Random();
       for ( int i =0 ; i <=maxRolls ;i ++  ){
            int die = random.nextInt(6) +1 ;
            currentSpace = currentSpace+die ;
            System.out.println(String.format( "Roll: %d , You Have Rolled a %d ", i,die) );
            if(currentSpace == maxSpace){
                System.out.println( " You are one " + currentSpace + " .Congrats You win");
                break;
            }
            else if( currentSpace > maxSpace ){
                System.out.println( "unfortunately that takes you past " + maxSpace + " spaces You lost !");
                break;
            } else if (i == maxRolls && currentSpace <maxSpace) {
                System.out.println( " You are one " + currentSpace );
                System.out.println("unfortunate  You didnt make it "+ maxSpace+" You loose !");
            }
            else{
                int spaceTogo = maxSpace - currentSpace;
                System.out.print(" You are Now on  the space "+ currentSpace + " You have to go " + spaceTogo +".");
            }
       }


    }
}
