package 剑指offer.二叉搜索树与双向链表;

public class Code {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }


    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    Node pre,head;
    public void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre == null) {
            head = root;
        }else{
            pre.right = root;
        }
        root.left = pre;
        pre = root;
        dfs(root.right);
    }


}
