

public class TunnidMinutidSekundid {

    public static void main (String[]args){

        int tunnid = 17;
        int minutid = 00;
        int sekundid = 00;

        System.out.println("Kell on: "+tunnid+":"+minutid+":"+sekundid+".");

        int SEC_PER_MINUTE = 60;
        int SEC_PER_HOUR = 60*SEC_PER_MINUTE;
        int SEC_PER_DAY = 24*SEC_PER_HOUR;
        int alatesKeskööst = tunnid*SEC_PER_HOUR + minutid*SEC_PER_MINUTE + sekundid;
        System.out.println("Alates keskööst on sekundeid kulunud: " + alatesKeskööst);

        System.out.println(SEC_PER_DAY - alatesKeskööst + " sekundit on jäänud päeva lõpuni.");

        System.out.println(alatesKeskööst * 100 / SEC_PER_DAY + " % päevast on läbi.");
    }
}