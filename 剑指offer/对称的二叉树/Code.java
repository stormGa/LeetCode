package 剑指offer.对称的二叉树;

/**
 * @author Kohath
 */
public class Code {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return auxFun(root.left, root.right);
    }

    private boolean auxFun(TreeNode L, TreeNode R) {

        if (L == null && R == null) return true;
        if (L == null || R == null || L.val != R.val) return false;
        return auxFun(L.left, R.right) && auxFun(L.right, R.left);
    }
}
