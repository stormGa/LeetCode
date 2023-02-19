package 剑指offer.二叉搜索树的最近公共祖先;

public class Code {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        while (root != null) {
            if (root.val < p.val) {
                root = root.left;
            } else if (root.val > q.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }
}
