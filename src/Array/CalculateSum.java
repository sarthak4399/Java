package Array;

public class CalculateSum {
    public static void main (String [ ] args){
//        usage
    Calc_sum(2,3);
    Calc_sum(2,3,4,56);
    Calc_sum(2,1);

    }
    public static void Calc_sum( int ...a){
//        int ...a is variable arguments
//        only one in method parameter
//        must be last argument

        int sum = 0 ;
        for (int i =0 ; i <a.length; i++){
             sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
