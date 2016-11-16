

public class Recurse {


    public static void main(String[] args) {

        String s = "palindromeemordnilap";
        char[] warray = s.toCharArray();

        System.out.println(first("Hello"));
        System.out.println(rest("Hello"));
        System.out.println(middle("Hello"));
        System.out.println(length("Hello"));
        printString("Hello");
        printBackward("Hello");
        reverseString("coffee");
        System.out.println(istPalindrom(warray));
    }

    public static char first(String s) {
        return s.charAt(0);
    }

    public static String rest(String s) {
        return s.substring(1);
    }

    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    public static int length(String s) {
        return s.length();
    }

    public static void printString(String s) {

        if (s == null){
            return;
        }for (int count = 0; count < s.length();count++){
            System.out.println(s.charAt(count));
        }

    }
    public static void printBackward ( String s){
        String r = "";

        for (int i = s.length() -1; i >= 0; i--){
            r = r + s.charAt(i);
        }
        printString(r);

    }
    public static void reverseString (String s){

        String backwards = "";

        for (int i = s.length() -1; i >= 0; i--){
            backwards = backwards + s.charAt(i);
        }System.out.println(backwards);
    }

    public static boolean istPalindrom(char[] s){
        boolean palindrom = false;
        if(s.length%2 == 0){
            for(int i = 0; i < s.length/2-1; i++){
                if(s[i] != s[s.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }else{
            for(int i = 0; i < (s.length-1)/2-1; i++){
                if(s[i] != s[s.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }

}