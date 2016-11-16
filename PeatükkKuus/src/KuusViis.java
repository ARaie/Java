public class KuusViis {

    public static void main (String[]args){

        boolean flag1 =isHoopy(201);
        boolean flag2 = isFrabjuous(202);
        System.out.println(flag1);
        System.out.println(flag2);
        if (flag1 && flag2){
            System.out.println("Ping!");
        }if (flag1 || flag2){
            System.out.println("Pong!");
        }
    }
    public static boolean isHoopy(int x){
        boolean hoopyFlag;
        if (x% 2 == 0){
            hoopyFlag =true;
        }else{
            hoopyFlag = false;
        }
        return hoopyFlag;
    }
    public static boolean isFrabjuous (int x){

        boolean frabjuousFlag;
        if (x >0){
            frabjuousFlag = true;
        }else{
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
}