public class Compare {

    public static int length = 100000;
    public static int[] arr = new int[length];

    public static void main(String[] args) {
        int min = -9999;
        int max = 9999;

        for ( int i = 0; i < length; i++ ) {
            arr[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        long start1 = System.currentTimeMillis();
        Bubble_sort.BubbleSort(arr);
        long end1 = System.currentTimeMillis();

        for ( int i = 0; i < length; i++ ) {
            arr[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        long start2 = System.currentTimeMillis();
        Quick_sort.QuickSort(arr, 0, length - 1);
        long end2 = System.currentTimeMillis();

        System.out.println ("Bubble : " + (end1 - start1));
        System.out.println("Quick : " + (end2 - start2));
    }
}
