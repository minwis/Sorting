public class Bubble_sort {

    public static void main(String args[]) {
        int[] arr = new int[] {3, 1, 4, 6, 7, 2, 5};
        for ( int i = 0; i < arr.length-1; i++ ) {
            for ( int j = 0; j < arr.length-1; j++ ) {
                if ( arr[j] > arr[j+1] ) {
                    int a = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i]);
        }
    }
}
