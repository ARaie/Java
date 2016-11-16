

public class Teoreem {

    public static void main ( String[]args){
        CheckFermat();
    }

    public static void CheckFermat() {
        int a = 2;
        int b = 2;
        int c = 1;
        int n = 4;
        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Töötab");
        }if (n > 2 ){
            System.out.println(" Ei tööta");
        }else {
            System.out.println("Ei, üldse kohe ei toimi");
        }
    }
}