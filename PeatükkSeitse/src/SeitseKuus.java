

public class SeitseKuus {

    public static void main ( String[]args){

        System.out.println(gauss(-2.0, 2));
    }
    public static double gauss ( double x, int n) {

        double result = 1.0;
        double term = 1.0;

        int i = 1;
        while ( i <= n) {
            term = -1*term*x*x/i;
            result = result + term;
            i = i + 1;
        }
        return result;
    }
}