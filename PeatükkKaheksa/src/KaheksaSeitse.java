

public class KaheksaSeitse {

    public static void main(String[] args) {


        int n = 6;
        int[] a ={1,2,3,6};

        System.out.println(arePrimeFactors(a, n));


    }

    public static boolean arePrimeFactors(int[] a, int n) {

        for (int i = 0; i < a.length; i++) {
            if (n % a[i] != 0) {
                return false;
                //  if (n % i == 0){
                //return false;
            }
        }return true;
    }
}