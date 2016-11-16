import java.util.Scanner;

public class KaheksaViis {


    public static void main (String[]args){

        System.out.println("Sisesta positiivne number, millest algnumbreid otsime ");
        int limit = new Scanner(System.in).nextInt();
        System.out.println("Sinu valitud numbrini "+limit+ " olid algnumbrid sellised: ");
        for (int n = 2; n <limit; n++){
            if(sieve(n)){
                System.out.println(n);
            }
        }
    }

    public static boolean sieve (int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }return true;

    }
}