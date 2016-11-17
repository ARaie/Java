

public class üheksaViis {

    public static void main (String[]args){

        // Võid neid sõnu võtta. Need on.
        //abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow,
        //bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, deinos,
        // diluvy, dimpsy


        System.out.println(isAbecedarian("deflux"));
    }

    public static boolean isAbecedarian ( String a){

        int index = 0;
        char c = 'a';
        while (index < a.length()){
            if (c > a.charAt(index)){
                return false;
            }
            c = a.charAt(index);
            index = index +1;
        }
        return true;
    }
}
