package 剑指offer.二叉树深度;

public class Code {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
      return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

