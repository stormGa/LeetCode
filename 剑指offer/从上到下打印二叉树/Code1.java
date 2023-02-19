package 剑指offer.从上到下打印二叉树;

import java.util.*;

/**
 * @author Kohath
 * @desc 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 */
public class Code1 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        return bfs(root);

    }

    public int[] bfs(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            list.add(tmp.val);
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
