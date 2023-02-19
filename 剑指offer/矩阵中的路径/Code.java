package 剑指offer.矩阵中的路径;

/**
 * @author Kohath
 */
public class Code {

    public boolean exist(char[][] board, String word) {
        //遍历二维数组中的每个元素，从每个元素开始判断是否有路径构成word。
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j)) {
                    return true;
                }  
            }
        }
        return  false;
    }

    private boolean dfs(char[][] board,int i,int j) {

        return true;
    }


}
