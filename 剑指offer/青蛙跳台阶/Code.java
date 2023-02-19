package 剑指offer.青蛙跳台阶;

/**
 * @author Kohath
 */
public class Code {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法
     * @param n
     * @return
     */
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int p = 1, q = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = (p + q) % 1000000007;
            p = q;
            q = result;
        }
        return result;
    }
}
