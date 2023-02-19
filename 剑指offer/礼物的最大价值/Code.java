package 剑指offer.礼物的最大价值;

/**
 * @author Kohath
 */
public class Code {
    /**
     * 动态规划
     *
     * @param grid
     * @return
     */
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m ][n ];
        dp[0][0] = grid[0][0];
        int res ;
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        res = Math.max(dp[m - 1][0], dp[0][n - 1]);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])+grid[i][j];
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }
}
