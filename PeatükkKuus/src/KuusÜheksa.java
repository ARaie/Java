

public class KuusÜheksa {

    public static void main (String[]args){

        System.out.println(power(2.0, 4));
    }

    public static double power (double x, int n) {

        if (x==n){
            return Math.pow(Math.pow(x, n/2), 2);
        }
        if (x == 0) {
            return 1;
        }else{
            return x * (Math.pow(x, n - 1));
        }
    }
}