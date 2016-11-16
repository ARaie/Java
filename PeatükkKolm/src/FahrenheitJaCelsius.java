import java.util.Scanner;


public class FahrenheitJaCelsius {


    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        final double celsius_PER_F = 33.8;

        System.out.println("Mitu kraadi? ");
        celsius = in.nextDouble();
        fahrenheit = (double) (celsius*9/5+32);
        System.out.println(celsius + " C = " + fahrenheit + " F");
    }



}