import java.util.Objects;

public class Binary_Tree {

    public static mynode root = null;

    public static void Add(mynode root, int n) {
        int j = 0;
        mynode curr = root;
        while ( true ) {
            if ( curr.v > n ) { //왼쪽노드로
                if ( curr.left_node == null ) {
                    curr.left_node = new mynode(n);
                    return;
                }
                else {
                    curr = curr.left_node;
                }
            }
            else { //오른쪽 노드로
                if ( curr.right_node == null ) {
                    curr.right_node = new mynode(n);
                    return;
                }
                else {
                    curr = curr.right_node;
                }
            }
        }
    }

    //starting from the node in the most left side
    //print left, itself, right

    public static boolean search = true;
    public static void PrintFunction(mynode currentnode) {
        if ( currentnode.left_node != null ) {
            PrintFunction(currentnode.left_node);
        }

        System.out.println(currentnode.v);

        if ( currentnode.right_node != null ) {
            PrintFunction(currentnode.right_node);
        }
    }
    public static void main(String[] args) {
        int max = 9999;
        int min = -9999;
        int[] arr = new int[20];
        for ( int i = 0; i < 20; i++ ) {
            arr[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        root = new mynode(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            Add(root, arr[i]);
        }
        PrintFunction(root);
    }
}
