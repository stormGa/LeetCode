package 剑指offer.重建二叉树;

/**
 * @author Kohath
 */
public class Code {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
     * Output: [3,9,20,null,null,15,7]
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
        int mid = findIndex(inorder, preorder[0]);
        root.left = buildTree(subArray(preorder, 1, mid + 1), subArray(inorder, 0, mid));
        root.right = buildTree(subArray(preorder, mid+1, preorder.length), subArray(inorder, mid+1, inorder.length));
        return root;
    }

    public int[] subArray(int[] arr, int begin, int end) {
        int size = end - begin;
        int[] array = new int[size];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[begin++];
        }
        return array;
    }
    public int findIndex(int[] arr,int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

}
