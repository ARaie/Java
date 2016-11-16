

public class ViiesTeine {

    public static void zoop(String fred, int bob){
        System.out.println(fred);
        if (bob == 5){
            ping("not ");
        }else{
            System.out.println("!");

        }

    }
    public static void main ( String[]args){
        int üks = 5;
        int kaks = 2;
        zoop("ainult", üks);
        nali(2*kaks);
    }
    public static void nali(int kolm){
        System.out.println("On ");
        zoop("Hommikusöök ", kolm);

    }
    public static void ping (String neli){
        System.out.println("Veidi"+neli+ "veel");
    }
}