public class Quick_sort {

    public static int[] QuickSort(int[] arr) {
        int pivot_position = (arr.length - 1) / 2;
        int pivot = arr[pivot_position];
        arr[pivot_position] = arr[arr.length - 1];
        arr[arr.length - 1] = pivot;
        int i = 0, j = 0;

        while ( i + j < arr.length / 2) {
            while ( arr[i] < pivot ) { //pivot보다 큰 수를 뒤로 보내야 함.
                i++;
            }
            while ( arr[arr.length - 2 - j] >= pivot ) {
                j++;
            }
            int a = arr[i];
            arr[i] = arr[arr.length - 2 - j];
            arr[arr.length - 2 - j] = a;
        }

        for ( int I = 0; I < arr.length; I++ ) {
            if ( arr[I] > pivot ) {
                int backup = arr[I];
                arr[I] = pivot;
                arr[arr.length - 1] = backup;
                break;
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = new int[] {8,1,6,9,6,3,5,2,7,0};
        System.out.println("Input: \n8169635270\n");
        System.out.println("Purposed to: \n2153066879\n\nOutput:");
        arr = QuickSort(arr);
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
