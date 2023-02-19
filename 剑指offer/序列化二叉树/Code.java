package 剑指offer.序列化二叉树;

import com.sun.source.tree.Tree;

/**
 * @author Kohath
 */
public class Code {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    TreeNode root ;
    public String serialize(TreeNode root) {
        this.root = root;
        return null;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return root;
    }

}
