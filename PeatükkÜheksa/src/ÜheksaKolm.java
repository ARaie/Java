
public class ÜheksaKolm {


    public static void main(String[] args) {

        System.out.println(loebSulge("((3+7)*2"));
    }

    public static int loebSulge(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }

        }
        return count;
    }
}