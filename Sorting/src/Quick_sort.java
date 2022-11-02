public class Quick_sort {

    public static int[] arr = new int[] {9,-3,5,2,3,8,-6,1,6};
    public static boolean check = false;
    public static void QuickSort(int start, int end) {
        if ( end - start <= 0 ) {
            return;
        }
        //identify pivot and move pivot to the place of arr.length - 1.
        int pivot_position = (end + start) / 2;
        int pivot = arr[pivot_position];
        arr[pivot_position] = arr[end];
        arr[end] = pivot;
        int i = 0, j = end - 1;

        //change positions
        do {
            while ( arr[i] < pivot ) {
                i++;
            }
            while ( j > 0 && arr[j] >= pivot ) {
                j--;
            }
            if ( j <= i ) {
                break;
            }
            int a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;
        } while ( i <= end - 1 && j >= 1 );

        int backup = arr[i];
        arr[i] = pivot;
        arr[end] = backup;


        QuickSort(start, pivot_position - 1); //pivot보다 작은 숫자들
        QuickSort(pivot_position + 1, end); //pivot보다 큰 숫자들
    }

    public static void print(int[] arr) {
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i]);
            if ( i != arr.length - 1 ) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort(0, arr.length-1);
        print(arr);
    }

}