import java.util.Random;
import java.util.Scanner;


public class NumbriArvamine {

    public static void main(String[] args) {


        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int number = random.nextInt(100) + 1;


        System.out.println("Arva ära mis numbri ma valin 1-100ni ");
        Integer kasutajanr = in.nextInt();
        System.out.println("Sinu number oli: " + kasutajanr);
        System.out.println("Nubmer mille mina valisin oli: " + number);
        System.out.println("Panid mööda " + (number - kasutajanr) + " -ga.");


    }
}