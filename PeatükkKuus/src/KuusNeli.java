

public class KuusNeli {

    public static double multadd (double a, double b, double c){

        double vastus = a*b+c;
        return vastus;
    }
    public static double expSum (double x){

        multadd(4.0, 5.0, 6.0);
        double väärtus = (x*Math.exp(x)+ Math.sqrt(1-Math.exp(x)));
        return väärtus;
    }
    public static void main (String[]args){

        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(expSum(4));
    }
}