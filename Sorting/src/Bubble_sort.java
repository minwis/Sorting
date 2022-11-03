public class Bubble_sort {

    public static void main(String args[]) {
        int[] arr = new int[] {9,-3,5,2,3,8,-6,1,6};
        for ( int i = 0; i < arr.length-1; i++ ) {
            for ( int j = i+1; j < arr.length; j++ ) {
                if ( arr[i] > arr[j] ) {
                    int a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i]);
            if ( i != arr.length - 1 ) {
                System.out.print(",");
            }
        }
    }
}
