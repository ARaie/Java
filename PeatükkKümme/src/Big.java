import java.math.BigInteger;

public class Big {


    public static void main (String[]args) {


        int n= 3000; // saab päris suuri numbreid kasutada
        int i = 0;
        for(i=1;i<=n;i++) {
            System.out.println(i +" "+factorial(i));
        }

    }


    public static BigInteger factorial(int n) {

        if (n == 0) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }
}
