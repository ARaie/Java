/* Ackermanni funktsioon
    A(0 , n) = n+1
    A(m , 0) = A(m-1, 1)
    A(m , n) = A(m - 1, A(m, n- 1))
*/
public class KuusKaheksa {
    public static void main (String[]args){

        System. out.println(ack(1, 2));
    }
    public static int ack (int m, int n){

        if ( m==0){
            return n +1;
        }if (n==0){
            return ack(m-1,1);
        }return ack(m-1, ack(m, n-1));
    }
}