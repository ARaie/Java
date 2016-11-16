import java.util.Scanner;


public class KaheksaÜks {

    public static void main(String[] args) {

        System.out.println("Mitmendasse astmesse paneme? ");

        double[] a = {1, 5, 4, 6, 3, 5, 3};


        powArray(a);
    }

    public static void powArray(double[] a) {


        Scanner aste = new Scanner(System.in);
        double astmes = aste.nextInt();

        System.out.println("Tulemus selline: ");

        for (int i = 1; i < a.length; i++) {
            a[i] = Math.pow(a[i], astmes);
            System.out.println(a[i]);
        }
    }

}