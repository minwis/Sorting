public class Quick_sort {

    public static int[] arr = new int[] {8,1,6,9,6,3,5,2,7,0};

    public static int[] QuickSort(int start, int end) {
        end--;

        int pivot_position = (end - start) / 2;
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
        return arr;
    }

    public static void main(String args[]) {
        System.out.println("Input: \n8169635270\n");
        System.out.println("Purposed to: \n2153066879\n\nOutput:");
        arr = QuickSort(0, arr.length);
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}