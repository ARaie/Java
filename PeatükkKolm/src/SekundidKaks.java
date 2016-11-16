import java.util.Scanner;


public class SekundidKaks {

    public static void main( String[]args){

        Scanner in = new Scanner(System.in);
        int s;
        int minutid;
        int tunnid;
        int remainder;
        int sekundid;
        final int SEK_PER_MIN = 60;
        final int MIN_PER_TUND = 60;

        System.out.println("Mitu sekundit? ");
        s = in.nextInt();

        minutid = (s / MIN_PER_TUND);
        tunnid = minutid/ SEK_PER_MIN;
        remainder = minutid % SEK_PER_MIN;
        sekundid = s-(tunnid*3600)-(remainder*60);
        System.out.println("See on: "+tunnid+" tundi "+remainder+" minutit ja "+sekundid+" sekundit.");

    }
}