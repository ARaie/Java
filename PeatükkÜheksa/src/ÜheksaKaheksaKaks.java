import java.util.HashMap;
import java.util.Map;


public class ÜheksaKaheksaKaks {

    public static void main(String[] args) {

        System.out.println(canSpell("quijbo","jib"));
    }
    public static boolean canSpell (String a, String b){

        Map<Character, Integer> hm = new HashMap<>();
        int count = 0;

        for ( int i = 0; i < a.length(); i++){
            Character key = a.charAt(i);


            if (hm.containsKey(key)){
                count =hm.get(key);
            }
            hm.put(key, ++count);
        }
        for (int i = 0; i < b.length(); i++){
            Character key = b.charAt(i);
            if (hm.containsKey(key)){
                if (count > 0){
                    hm.put(key, --count);
                }else{
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }

}
