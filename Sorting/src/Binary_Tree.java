import java.util.Objects;

public class Binary_Tree {

    /*
    Tree algorithm: 만약 현재 node보다 작다면 왼쪽으로, 크다면 오른쪽으로 움직이면서 node가 저장되어있지 않은 공간을 찾을 때까지
    재귀를 돔. 만약 저장 공간을 찾았다면 배열에서 나온 숫자를 저장. 저장한 다음 계속 return 해서 첫 번째 recursion으로 돌아감과
    동시에 새로운 array 숫자 받기.
    */

    //일단 일차원적인 binary tree를 위한 recursion 만들기.

/*
    public static void BinaryTree(int n) {
        mynode node = new mynode(); //노드들을 연결 시켜야 함. 리커젼들 서로의 노드를 알고 있어야 함. 새로운 노드를 저장할 공간을 새로 찾아야 함.

        if ( Return && Integer.parseInt(node.self_node) != arr[0] ) {
            return;
        }
        if ( Integer.parseInt(node.self_node) == arr[0] ) {
            Return = false;
            i++;
            n = arr[i];
        }
        if ( Integer.parseInt(mynode.self_node) <= n ) {
            if ( node.right_node == null ) {
                mynode new_node = new mynode();
                new_node.self_node = node.right_node;
                Return = true;
            }
            else {
                BinaryTree(n);
            }
        }
        else {
            if ( node.left_node == null ) {
                mynode new_node = new mynode();
                new_node.self_node = node.left_node;
                Return = true;
            }
            else {
                BinaryTree(n);
            }
        }
    }
*/

    public static void Add(mynode root, int n) {
        int j = 0;
        mynode curr = root;
        while ( true ) {
            if ( curr.v < n ) { //왼쪽노드로
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

            //여러번 돌 때.

        }
    }

    public static void Print(mynode root) {
        //starting from the node in the most left side
        //print left, itself, right

    }
    public static void main(String[] args) {
        int[] arr = new int[] {4, 8, 7, 3, 2, 5, 9, 1, 6};
        mynode root = new mynode(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            Add(root, arr[i]);
        }
        Print(root);
    }
}
