public class test {

    public static int[] arr = new int[] {4, 8, 7, 3, 2, 5, 9, 1, 6};
    public static int a = 0;
    public static boolean does_return = false;

    public static void test( int[] arr ) {
        if ( a == 8 || does_return) {
            does_return = true;
            return;
        }
        mynode dummy = new mynode();
        dummy.self_node = String.valueOf(arr[a]);
        a++;
        test(arr);
    }

    public static void main(String[] args) {
        test(arr);
    }
}
