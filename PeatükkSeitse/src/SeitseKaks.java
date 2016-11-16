

public class SeitseKaks {

    public static void main(String[] args) {

        System.out.println(squareRoot(4.0));
    }

    public static double squareRoot(double a) {

        double t;
        double ruutJuur = a / 2;

        do {
            t = ruutJuur;
            ruutJuur = (t + (a / t)) / 2;
        } while ((t - ruutJuur) != 0);
        {

            return ruutJuur;
        }
    }
}