import java.math.BigInteger;

public class KümmeViis {


    public static void main ( String[]args){

        System.out.println(pow(100, 1000));
    }
    public static BigInteger pow (int x, int n){

        if (n==0) return BigInteger.valueOf(1);

        BigInteger t = pow(x, n/2);

        if (n%2 == 0){
            return t.multiply(t);
        }else{
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
}
