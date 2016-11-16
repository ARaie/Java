

public class LauluSalmid {

    public static void loeb (int n){
        if (n==0){
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around,\n" +
                    "’cause there are no more bottles of beer on the wall!\n");
        }else{
            System.out.println(n +" bottles of beer on the wall,\n"+n+
                    " bottles of beer,\n"+
                    "ya’ take one down, ya’ pass it around,\n"+(n-1)+"bottles of beer on the wall.\n");
            loeb(n-1);
        }
    }
    public static void uusRida (int n){
        if (n>0){
            System.out.println();

        }

    }
    public static void main (String[]args){
        int n = 12;
        loeb(n);
        uusRida(n);
    }
}