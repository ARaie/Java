import java.util.Scanner;


public class SekundiArvutaja {

    final public static int STRING =0;
    final public static int INT =1;
    final public static int DOUBLE =2;
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int sekundid;
        int sekundid2;
        int tunnid;
        int tundidejaakminutites;
        int minutitejaak;
        final int   SEKUNDEIDTUNNIS = 3600;

        sekundid = Integer.parseInt(loe("Sisesta sekundid", INT));
        tunnid = (int) (sekundid/SEKUNDEIDTUNNIS);
        minutitejaak = sekundid%SEKUNDEIDTUNNIS;
        tundidejaakminutites = (sekundid - minutitejaak)%SEKUNDEIDTUNNIS;


        sekundid2 = minutitejaak;

        System.out.printf(sekundid + " sekundit on " + tunnid + " tundi " + tundidejaakminutites + " minutit " + " ja " + sekundid2 + " sekundit.");


    }
    public static String loe(String küsimus, int TYPE){
        Scanner in = new Scanner(System.in);
        System.out.println(küsimus);
        switch(TYPE){
            case STRING:
                String ans = in.nextLine();
                return ans;

            case INT:
                int ansi = in.nextInt();
                return Integer.toString(ansi);

            case DOUBLE:
                double ansd = in.nextDouble();
                return Double.toString(ansd);
            default :
                return "Type Error";
        }


    }

}