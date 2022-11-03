public class Quick_sort {
    public static void QuickSort(int[] arr, int start, int end) {
        if ( end - start <= 0 ) {
            return;
        }
        int pivot_position = (end + start) / 2;

        int pivot = arr[pivot_position];
        arr[pivot_position] = arr[end];
        arr[end] = pivot;
        int i = 0, j = end - 1;

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

        QuickSort(arr, start, pivot_position - 1);
        QuickSort(arr, pivot_position + 1, end);
    }
}