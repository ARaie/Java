

public class KaheksaKaheksa {

    public static void main (String[]args){

        int[] a = {1,2,3,4,9,6,7};
        System.out.println(max(a,2));
    }

    public static int maxInRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] <= high) {
                count++;
            }
        }
        return count;
    }

    public static double max(int[] a, int n) {

        double max = maxInRange(a, 0, a.length - 1);
        return max;
    }
}