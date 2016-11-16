import java.util.Scanner;


public class Logaritm {

    public static void küsiNumber(){

        Scanner in = new Scanner(System.in);
        System.out.println("Sisesta number: ");
        if (!in.hasNextDouble()){
            String sõna = in.next();
            System.err.println(sõna+" ei ole number!");
            return;

        }
        double x = in.nextDouble();
        arvuta(x);
    }
    public static void arvuta(double x){
        if (x <= 0.0){
            System.err.println("Viga: x peab olema positiivne");
            return;
        }
        double vastus = Math.log(x);
        System.out.println("Logaritm x-st on: "+ vastus);
    }
    public static void main ( String[]args){
        küsiNumber();
    }
}