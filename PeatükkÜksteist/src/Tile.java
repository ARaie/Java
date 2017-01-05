
public class Tile {

        char letter;
        int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public static void printTile(Tile tPrint) {
        System.out.println("The tile " + tPrint.letter + " has the score of " + tPrint.value);
    }

    public static void testTile() {
        Tile test = new Tile('z', 10);
        printTile(test);
    }

    public String toString() {
        return String.format("%s,%02d\n",
                this.letter, this.value);
    }

    public boolean equals (Tile that){

        return this.letter == that.letter
                && this. value == that.value;
    }

    public char getLetter() {

        return this.letter;
    }
    public int getValue() {

        return this.value;
    }

    public void setLetter(char letter) {

        this.letter = letter;
    }
    public void setValue(int value) {

        this.value = value;
    }


        public static void main(String[] args) {

            testTile();
        }


    }

