

 public class Time {

     static int hour;
     static int minute;
     static double second;


     public Time() {
         this.hour = 0;
         this.minute = 0;
         this.second = 0.0;
     }


     public Time(int hour, int minute, double second) {
         this.hour = hour;
         this.minute = minute;
         this.second = second;
     }


     public String toString() {
         return String.format("%02d:%02d:%04.1f\n",
                 this.hour, this.minute, this.second);

     }

     public static void increment(Time aeg) {
         double result = Time.second % 60.0;
         Time.second= result;
         if ( result > 1) {
             Time.minute += 1;
         }
         int x = Time.minute % 60;
         Time.minute= x;
         if ( x > 1) {
             Time.hour += 1;
         }
         int y = Time.hour % 24;
         Time.hour= y;

     }


     public static void main(String[] args) {

         Time aeg = new Time(26, 68, 09.0);
         increment(aeg);
         System.out.println(aeg);

     }
 }
