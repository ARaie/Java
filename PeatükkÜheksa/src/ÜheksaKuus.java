

public class ÜheksaKuus {


    public static void main (String[]args){

        //Võib neid kasutada. Need kindlalt on.
        // Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bilabial,
        // boob, Caucasus, coco, Dada, deed, Emmett, Hannah, horseshoer,
        // intestines, Isis, mama, Mimi, murmur, noon, Otto, papa,
        //  peep, reappear, redder, sees, Shanghaiings, Toto



        System.out.println(isDoubloon("Dadda"));
    }
    public static boolean isDoubloon (String a){

        int [] hist = new int [26];

        for (int i = 0; i < a.length(); i++){

            char r = a.toLowerCase().charAt(i);

            if ('a' <= r && r <= 'z'){
                hist[r - 'a']++;
            }
        }
        for (int i = 0; i < hist.length; i++){
            if (hist[i] != 0 && hist[i] !=2){
                return false;
            }
        }
        return true;
    }
}
