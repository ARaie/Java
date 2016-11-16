

public class Loeb {

    public static void loeb (int n){
        if (n==0){
            System.out.println("Läbi!");
        }else{
            System.out.println(n);
            loeb(n-1);
        }
    }
    public static void uusRida (int n){
        if (n>0){
            System.out.println();

        }

    }
    public static void main (String[]args){
        int n = 4;
        loeb(n);
        uusRida(n);
    }
}