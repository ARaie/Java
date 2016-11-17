import java.awt.*;

public class KümmeKaks {

    public static double distance (Point p1, Point p2){

        int dx = p2.x - p1.x; // 5-2= 3
        int dy = p2.y - p1.y; // 8-3= 4
        return Math.sqrt(dx * dx + dy * dy); // 9+16=25 ja sellest ruutjuur.
    }
    public static Point findCenter(Rectangle box){

        int x = box.x + box.width / 2;  // 0+4/2 = 2
        int y = box.y + box.height / 2; // 2+4/2 = 4
        return new Point(x, y);
    }
    public static void main (String[]args){

        Point blank = new Point(5, 8); // Antakse punktile väärtused.

        Rectangle rect = new Rectangle(0, 2, 4, 4); // Antakse Rectangle'le väärtused.
        Point center = findCenter(rect); // 1

        double dist = distance(center, blank); // 2 Minnakse daistance meetodisse. Väärtusteks võetakse(2,3) ja (4,8)
        System.out.println(dist); // 3 prinditakse välja tulemus
    }

}
