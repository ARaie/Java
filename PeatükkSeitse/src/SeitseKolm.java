

public class SeitseKolm {

    public static void main (String[]args){

        System.out.println(power(4.0, 2));
    }

    public static double power (double x, int n) {

        if (n==0){
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double temp = x;
        double curMul = n % 2 == 0 ? 1: x;
        n /= 2;
        while (n > 0){
            temp *= temp;
            if (n % 2 == 1){
                curMul *= temp;
            }
            n /= 2;
        }
        return curMul;
    }
}