package inheritance;

public class Square extends Rectangle {


    @Override
    public double calc_Perimeter(){
        return  sides * length ;  // inheritance override annotation use
    }

    public void print(String Word ){
        System.out.println(" I am the " );
    }



}
