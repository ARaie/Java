public class SeitseNeli {

    public static void main (String[]args){
        System.out.println(factorial(10));
    }

    public static long factorial(int n) {
        long result = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}