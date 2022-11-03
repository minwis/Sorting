public class Bubble_sort {

    public static int[] arr = Compare.arr;

    public static void main(String args[]) {
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
