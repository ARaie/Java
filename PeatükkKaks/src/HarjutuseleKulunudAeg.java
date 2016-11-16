

public class HarjutuseleKulunudAeg {

    public static void main ( String[]args){

        int tunnid = 17;
        int minutid = 00;
        int sekundid = 00;


        int SEC_PER_MINUTE = 60;
        int SEC_PER_HOUR = 60*SEC_PER_MINUTE;
        int SEC_PER_DAY = 24*SEC_PER_HOUR;
        int algusAeg = tunnid*SEC_PER_HOUR + minutid*SEC_PER_MINUTE + sekundid;

        int t = 17;
        int m = 01;
        int s = 00;

        int lõpuaeg = t*SEC_PER_HOUR + m*SEC_PER_MINUTE+ s;
        int koguaeg = lõpuaeg - algusAeg;
        System.out.println("Harjutuseks kulus aega: "+ koguaeg+ " sekundit.");
    }
}