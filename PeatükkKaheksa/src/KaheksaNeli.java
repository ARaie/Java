public class KaheksaNeli {

    public static void main ( String[] args){

        int[] largeArray = {5,4,21,14,9,18,6,3};

        System.out.println(indexOfMax(largeArray, findLargest(largeArray)));
    }

    public static int findLargest (int array[]) {

        int largest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }

        }
        return largest;
    }


    public static int indexOfMax (int array[], int number){

        for ( int i = 0; i < array.length; i++){
            if ( array[i] == number)
                return i;
        }
        return -1;
    }
}