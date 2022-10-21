public class Quick_sort {

    public static void QuickSort(int[] arr) {
        int half_len = (arr.length - (arr.length % 2)) / 2;
        int pivot = arr[half_len - 1];

        for ( int i = 0; i <= half_len; i++ ) {

            //NfromLeft와 NfromLeft를 바꾼다.
            int NfromLeft_position = 0;
            int NfromRight_position = 0;
            for (int j = 0; j < half_len; j++ ) {
                if ( arr[j] >= pivot ) {
                    NfromLeft_position = j;
                    break;
                }
            }
            for (int j = arr.length - 1; j >= half_len; j-- ) {
                if ( arr[j] <= pivot ) {
                    NfromRight_position = j;
                    break;
                }
            }
            int a = arr[NfromLeft_position];
            arr[NfromLeft_position] = arr[NfromRight_position];
            arr[NfromRight_position] = a;
        }

        System.out.println("no error");

    }

    public static void main(String args[]) {
        int[] arr = new int[] {8,1,6,9,6,3,5,2,7,0};;
        QuickSort(arr);
    }

}
