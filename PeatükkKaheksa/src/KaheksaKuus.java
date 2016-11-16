

public class KaheksaKuus {


    public static void main(String[] args) {

        int n = 6;
        int[] a = {1, 2, 3, 5};

        System.out.println(areFactors(a, n));

    }


    public static boolean areFactors(int[] a, int n) {

        for (int i = 0; i < a.length; i++) {
            if (n % a[i] != 0) {
                return false;
            }
        }return true;
    }
}