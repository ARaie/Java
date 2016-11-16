

public class KuusKolm {

    public static void main ( String[]args){
        System.out.println(onKolmnurk(2, 2, 3));
    }

    public static boolean onKolmnurk (int a, int b, int c){


        if (a >= b + c){
            return false;
        }if (b >= a + c){
            return false;
        }if (c >= b + a){
            return false;
        }else{
            return true;
        }

    }
}