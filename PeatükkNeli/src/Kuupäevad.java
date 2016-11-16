

public class Kuupäevad {

    public static void prindiAmeerika(){

        String nädalapäev = "Reede";
        int päev = 21;
        String kuu = "Oktoober";
        int aasta = 2016;

        System.out.println(nädalapäev + ", "+ kuu + " " +päev +", "+ aasta);
    }
    public static void main (String[]args){

        prindiAmeerika();
        prindiEuroopa();
    }
    public static void prindiEuroopa(){
        String nädalapäev = "Reede";
        int päev = 21;
        String kuu = "Oktoober";
        int aasta = 2016;
        System.out.println(nädalapäev+ " " + päev +" "+ kuu +" "+ aasta);

    }

}