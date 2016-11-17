
public class ÜheksaSeitse {

    public static void main (String[]args){

        System.out.print(isAnagram("allen dowNey","well annoyed"));
    }

    public static boolean isAnagram (String a, String b){

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()){
            return false;
        }
        if (a.equals(b)){
            return true;
        }

        String teineSõna = b;
        for (int i = 0; i < a.length(); i++){
            if (teineSõna.indexOf(a.charAt(i)) == -1){
                return false;
            }
            teineSõna = teineSõna.replaceFirst(a.charAt(i) + "", "");
        }
        if (teineSõna.length() > 0){
            return false;
        }return true;
    }
}
