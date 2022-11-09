import java.util.Objects;

public class Binary_Tree {

    /*
    Tree algorithm: 만약 현재 node보다 작다면 왼쪽으로, 크다면 오른쪽으로 움직이면서 node가 저장되어있지 않은 공간을 찾을 때까지
    재귀를 돔. 만약 저장 공간을 찾았다면 배열에서 나온 숫자를 저장. 저장한 다음 계속 return 해서 첫 번째 recursion으로 돌아감과
    동시에 새로운 array 숫자 받기.
    */

    //일단 일차원적인 binary tree를 위한 recursion 만들기.

    public static int[] arr = new int[] {4, 8, 7, 3, 2, 5, 9, 1, 6};
    public static boolean Return = false;
    public static int i = 0;

    public static void BinaryTree(int n) {
        mynode node = new mynode();

        //숫자 저장 다음 root node로 돌아감. 다음 숫자 받을 준비 함.
        if (Return && !Objects.equals(node.self_node, String.valueOf(arr[0]))) {
            return;
        }
        else if ( Objects.equals(node.self_node, String.valueOf(arr[0])) ) {
            i++;
        }

        //저장공간을 찾았을 때. 숫자 저장, root node로 돌아가게 만듬.
        if ( node.self_node == null )  {
            node.self_node = String.valueOf(n);
            Return = true;
        }

        BinaryTree(arr[i]);
    }

    public static void main(String[] args) {
        BinaryTree(arr[0]);
    }
}
