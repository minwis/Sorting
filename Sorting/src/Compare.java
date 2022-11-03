public class Compare {

    public static int length = 15;
    public static int[] arr = new int[length];

    public static void main(String[] args) {

        int pass = 0;
        int fail = 0;

        for ( int i = 0; i < 1000000; i++ ) {
            for ( int j = 0; j < length; j++ ) {
                int min = -9;
                int max = 9;
                arr[j] = (int)Math.floor(Math.random()*(max-min+1)+min);
            }

            long start1 = System.currentTimeMillis();
            new Bubble_sort();
            long end1 = System.currentTimeMillis();

            long start2 = System.currentTimeMillis();
            new Quick_sort();
            long end2 = System.currentTimeMillis();



            if ( (end1 - start1) > (end2 - start2) ) {
                pass++;
            }
            else {
                fail++;
            }
        }

        if ( pass > fail ) {
            System.out.println("QuickSort is fater");
        }
        else {
            System.out.println("BubbleSort is fater");
        }
    }
}
