public class KuusSeitse {

    public static void main(String[] args) {
        int n = -3;

        if (n%2 == 0) {
            System.out.println("Paaris number aga, ");
        }
        if (n <= 0){
            System.out.println("Negatiivne number");
        }
        else
        {
            oddSum(n);
        }
        System.out.println(oddSum(n));


    }


    public static int oddSum(int n) {


        if (n <= 0)
        {
            return 0;
        }
        else {
            return (n + oddSum(n-1));
        }

    }
}