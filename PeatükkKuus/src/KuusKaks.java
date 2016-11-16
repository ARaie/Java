

public class KuusKaks {
    public static void main (String[]args) {


        System.out.println(isDivisible(4,3));


    }

    public static boolean isDivisible(int m, int n) {
        boolean arvJagub;
        if (m % n == 0) {
            arvJagub = true;
        } else {
            arvJagub = false;
        }return arvJagub;
    }
}
