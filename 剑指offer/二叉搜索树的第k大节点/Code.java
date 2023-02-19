package 剑指offer.二叉搜索树的第k大节点;

public class Code {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int res ,k;
    void dfs(TreeNode root) {
        if (root == null) {
            return ;
        }
        dfs(root.right);
        if (k == 0) {
            return;
        }
        if (--k == 0) {
            res = root.val;
        }
        dfs(root.left);

    }
}
