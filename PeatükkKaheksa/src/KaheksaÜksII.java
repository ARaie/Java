import java.util.Random;


public class KaheksaÜksII {

    public static void main (String[]args){

        int[] scores = randomArray(30);

        histogram(scores);
    }

    public static int[] randomArray ( int size){

        Random random = new Random();
        int[] a = new int [size];
        for (int i = 0; i <a.length; i++){
            a[i] = random.nextInt(100);
            System.out.print(a[i]+" ");
        }return a;
    }
    public static void histogram (int[] a){

        String output = "Tulemus";
        for ( int counter = 0; counter < a.length; counter++ ) {
            output += "\n" + counter + "\t" + a[ counter ] + "\t";
            for ( int stars = 0; stars < a[ counter ]; stars++ ) {
                output += "*";
            }
        }
        System.out.println(output);

    }
}