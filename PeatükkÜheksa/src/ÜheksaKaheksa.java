

public class ÜheksaKaheksa {

    public static void main(String[] args) {


        String a= "jib";
        String b = "quijibo";
        System.out.println(canSpell(a, b));

    }

    public static boolean canSpell(String a, String b) {

        if (b.indexOf(a) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
