package 动态规划练习.不同路径;

/**
 * @author Kohath
 * @desc LeetCode.62
 */
public class Code {
    public static void main(String[] args) {
        int m = 3, n = 7;
        int result = uniquePaths(m, n);
        System.out.println(result);
    }

    private static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i <n; i++) {
            dp[0][i] = 1;
        }
        for (int j = 0; j < m; j++) {
            dp[j][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m-1][n-1];
    }
}
