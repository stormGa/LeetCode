package 动态规划练习.不同的搜索二叉树;

/**
 * @author Kohath
 * @desc LeetCode.96
 *
 * @notice 卡特兰数  G(n)=G(0)∗G(n−1)+G(1)∗(n−2)+...+G(n−1)∗G(0)
 */
public class Code {
    public static void main(String[] args) {
        System.out.println(numTrees(4));
    }
    public  static int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //卡特兰数  G(n)=G(0)∗G(n−1)+G(1)∗(n−2)+...+G(n−1)∗G(0)
                dp[i]+= dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
    
}

