
public class ÜheksaKaks {


    public static void main(String[] args) {


        letterHist("Hello");
    }

    public static void letterHist(String a) {

        int amount[] = new int[25];
        for (char c : a.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                c = Character.toLowerCase(c);
                amount[c - 'a'] += 1;
            }
        }
        for (int i = 0; i < amount.length; i++) {
            System.out.printf("%s:", (char) ('a' + i));
            for (int j = 0; j < amount[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}