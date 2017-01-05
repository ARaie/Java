
public class Date {

        int year;
        int month;
        int day;


        public static void main(String[] args) {

            Date birthday = new Date(1990, 06, 28);
            System.out.println(birthday.day + "-" + birthday.month + "-" + birthday.year);
        }

        public Date() {
            this.year = 0;
            this.month = 0;
            this.day = 0;
        }

        public Date(int year, int month, int day) {

            this.year = year;
            this.month = month;
            this.day = day;
        }
    }


