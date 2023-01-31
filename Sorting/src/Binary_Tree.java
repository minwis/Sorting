import java.util.Objects;

public class Binary_Tree {

    public static void Add(mynode root, int n) {
        int j = 0;
        mynode curr = root;
        while ( true ) {
            if ( curr.v > n ) {
                if ( curr.left_node == null ) {
                    curr.left_node = new mynode(n);
                    return;
                }
                else {
                    curr = curr.left_node;
                }
            }
            else {
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

    public static void Print(mynode currentnode) {
        if ( currentnode.left_node != null ) {
            Print(currentnode.left_node);
        }

        System.out.println(currentnode.v);

        if ( currentnode.right_node != null ) {
            Print(currentnode.right_node);
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[] {4, 8, 7, 3, 2, 5, 9, 1, 6};
        mynode root = new mynode(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            Add(root, arr[i]);
        }
        Print(root);
    }
}
