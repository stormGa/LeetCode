package 剑指offer.二叉搜索树的后序遍历序列;

/**
 * @author Kohath
 */
public class Code {

    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    /**
     * 递归
     *
     * @param postorder
     * @param i
     * @param j
     * @return
     */
    private boolean recur(int[] postorder, int i, int j) {
        if (i >= j) {
            return true;
        }
        int p = i;
        while (postorder[p] < postorder[j]) {
            p++;
        }
        int m = p;
        while(postorder[p] > postorder[j]) {
            p++;
        }
        return p == j && recur(postorder,i, m - 1)&&recur(postorder,m,j-1);

    }


}
