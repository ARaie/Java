
public class Rational {


        int numerator, denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }
    public static void printRational(Rational tPrint) {
        System.out.println(tPrint.numerator + "/" + tPrint.denominator);
    }

        public static void main(String[] args) {
            Rational test = new Rational(1, 7);
            printRational(test);
            String s = test.toString();
            System.out.println(test);
            negate(test);
            printRational(test);
            invert(test);
            printRational(test);
            double doubleValue = toDouble(test);
            System.out.println(doubleValue);
            reduce(test);
            Rational testAdd = new Rational(5, 7);
            printRational(add(test, testAdd));
        }

    public String toString() {
        return String.format("%01d,%01d\n",
                this.numerator, this.denominator);
    }

        public Rational(int n, int d) {
            this.numerator = n;
            this.denominator = d;
        }

    public static void negate(Rational test) {
        test.numerator = test.numerator * -1;
        if(test.denominator <= 0) {
            test.numerator = test.numerator * -1;
            test.denominator = test.denominator * -1;
        }
    }
    public static void invert(Rational test) {
        int tempN = test.numerator;
        int tempD = test.denominator;
        test.numerator = tempD;
        test.denominator = tempN;
    }
    public static double toDouble(Rational test) {
        double retval = (double)test.numerator / (double)test.denominator;
        return retval;
    }
    public static void reduce(Rational test) {
        int remain, num1, num2;
        num1 = test.numerator;
        num2 = test.denominator;
        remain = num1 % num2;
        while(remain != 0) {
            remain = num1 % num2 ;
            num1 = num2;
            num2 = remain;
        }
        int GCD = num1;
        Rational ret = new Rational(test.numerator/GCD, test.denominator/GCD);
        printRational(ret);
    }

    public static Rational add(Rational test, Rational testAdd) {
            Rational retAdd = new Rational(0, 0);
            if(test.denominator == testAdd.denominator) {
                retAdd.numerator = test.numerator + testAdd.numerator;
                retAdd.denominator = test.denominator;
                return retAdd;
            } else {
                retAdd.numerator = test.numerator * testAdd.denominator;
                retAdd.denominator = test.denominator * testAdd.denominator;
                testAdd.numerator = testAdd.numerator * test.denominator;
                testAdd.denominator = testAdd.denominator * test.denominator;
                retAdd.numerator += testAdd.numerator;
                int remain, num1, num2;
                num1 = retAdd.numerator;
                num2 = retAdd.denominator;
                remain = num1 % num2;
                while(remain != 0) {
                    remain = num1 % num2 ;
                    num1 = num2;
                    num2 = remain;
                }
                int GCD = num1;
                retAdd.numerator = retAdd.numerator/GCD;
                retAdd.denominator = retAdd.denominator/GCD;
                return retAdd;
            }
        }

    }
