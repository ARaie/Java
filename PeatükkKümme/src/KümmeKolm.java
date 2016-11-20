import java.awt.*;



    public class KümmeKolm {

        public static void printPoint (Point p){

            System.out.println("("+p.x+", "+p.y+")"); // 7, 13 prindib välja punkti (5, 8)
        }

        public static Point findCenter (Rectangle box){

            int x = box.x + box.width / 2; // 3,10 x = 5,
            int y = box.y +box.height / 2; // 4, 11 y = 8
            return new Point(x, y); // 5, 12 annab välja väärtuse (5, 8)
        }

        public static void main (String[]args){

            Rectangle box1 = new Rectangle(2, 4, 7, 9);// 1 Antakse box1-le väärtused.
            Point p1 = findCenter(box1); // 2 Võtab box1 väärtused ja läheb findCenter meetodisse.
            printPoint(p1); // 6 minnakse printPoint meetodisse.

            box1.grow(1, 1); // 8 arvasin, et väärtused suurenevad aga jäävad ikka samaks.
            Point p2 = findCenter(box1); // 9 minnakse findCenter meetodisse box1 väärtustega.
            printPoint(p2); // 13 läheb jälle printPoint meetodisse punktiga p2 ja alles seal prinditakse tulemus ekraanile.
        }
    }

