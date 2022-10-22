public class Quick_sort {

    public static int[] QuickSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;//특정 부분을 정렬

        int pivot_position = (arr.length - 1) / 2;
        int pivot = arr[pivot_position];
        arr[pivot_position] = arr[arr.length - 1];
        arr[arr.length - 1] = pivot;
        int i = 0, j = arr.length - 2;

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
        } while ( i <= arr.length - 2 && j >= 1 );

        int backup = arr[i];
        arr[i] = pivot;
        arr[arr.length - 1] = backup;
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = new int[] {8,1,6,0,0,3,5,2,7,6};
        System.out.println("Input: \n8169635270\n");
        System.out.println("Purposed to: \n2153066879\n\nOutput:");
        arr = QuickSort(arr);
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
