import java.util.Random;
import java.util.Scanner;


public class ArvaMuNumberKaks {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int katse;
        int katsetearv = 0;
        boolean win = false;

        while (win == false) {
            System.out.println("Arva ära mis numbri ma valisin 1-100ni.");
            katse = in.nextInt();
            katsetearv++;


            if (katse == number) {
                win = true;
            } else if (katse < number) {
                System.out.println("Pakkusid liiga vähe");
            } else if (katse > number) {
                System.out.println("Pakkusid liiga palju");
            }
        }
        System.out.println("Ära arvasid!");
        System.out.println("Õige number oli " + number);
        System.out.println("Sul kulus katseid " + katsetearv);
    }

}