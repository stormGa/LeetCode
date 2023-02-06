package 动态规划练习.斐波那契数;

/**
 * @author Kohath
 * @desc 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和
 * @exam F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * @analysis 时间复杂度O(N) ,空间复杂度O(n),优化后空间复杂度O(1)
 */
public class Code {
    public static void main(String[] args) {
        int n = fib(10);
    }

    private static int fib(int n) {
        if (n < 2) {
            return n;
        }
        //定义dp数组,dp[0] 表示F(0)的值
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * 因为数据只依赖于前两个状态的值，所以采用混动数组的形式去存储值
     * 优化后 空间复杂度O(1)
     */
    private static int fibOptimization(int n) {
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }


}
