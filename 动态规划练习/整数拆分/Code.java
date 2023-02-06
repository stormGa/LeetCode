package 动态规划练习.整数拆分;

/**
 * @author Kohath
 * @desc LeetCode.343
 * @exam 输入: n = 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 */
public class Code {

    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {

            for (int j = 0; j <= i / 2; j++) {
               dp[i] = Math.max(dp[i],Math.max(j * (i - j), j * dp[i - j]));
            }

        }
        return dp[n];
    }
}
