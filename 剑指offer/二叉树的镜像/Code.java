package 剑指offer.二叉树的镜像;

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

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
