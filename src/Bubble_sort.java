public class Bubble_sort {

    public static void main(String args[]) {
        int[] arr = new int[] {3, 1, 4, 6, 7, 2, 5};
        while ( true ) {
            int count = 0;
            for ( int i = 0; i < arr.length-1; i++ ) {
                if ( arr[i] > arr[i+1] ) {
                    int a = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = a;
                }
                else {
                    count++;
                }
            }
            if ( count == arr.length - 1 ) {
                for (int j : arr) {
                    System.out.print(j);
                }
                return;
            }
        }
    }
}
