import java.awt.*;

public class KümmeÜks {

    public static int riddle (int x, Point p){

        x = x +7;  // 2 Teeb arvutuse ja saab 13.
        return x + p.x + p.y; // 3 Väljastab 13+1+2 - 15
    }
    public static void main (String[]args){

        int x = 5;
        Point blank = new Point(1, 2);

        System.out.println(riddle(x, blank)); // 1 Alustab siit ja võtab int x=5 kaasa.
        System.out.println(x);  // 4 Prindib välja main-ist 5.
        System.out.println(blank.x); // 5 Prindib välja main-ist 1.
        System.out.println(blank.y);  // 6 Prindib välja main-ist 1.
    }
}
