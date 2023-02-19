package 剑指offer.从上到下打印二叉树;

import java.util.*;

/**
 * @author Kohath
 * @desc 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推
 */
public class Code3 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i =0;
        while (!queue.isEmpty()) {
            List<Integer> cRes = new ArrayList<>();
            for (int j = queue.size(); j >0; j--) {
                TreeNode tmp = queue.poll();
                cRes.add(tmp.val);
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
            if (i++ % 2==0) {
                res.add(cRes);
            }else {
                Collections.reverse(cRes);
                res.add(cRes);
            }

        }

        return res;
    }
}
