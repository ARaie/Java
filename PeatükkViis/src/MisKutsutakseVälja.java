

public class MisKutsutakseVälja {

    public static void baffle (String blimp){

        System.out.println(blimp);
        zippo("ping", -5);

    }
    public static void zippo ( String quince, int flag){
        if (flag < 0){
            System.out.println(quince+ " zoop");
        }else{
            System.out.println("ik"); //1
            baffle(quince);
            System.out.println("Hahaha");
        }
    }
    public static void main (String[]args){
        zippo("rattle", 13);
    }

}