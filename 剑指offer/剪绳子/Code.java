package 剑指offer.剪绳子;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Kohath
 */
public class Code {
    /**
     * @param n n>=2
     * @return
     */
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i], Math.max(j*dp[i - j], j * (i - j)));
            }

        }
        return dp[n];
    }

    /**
     * 加大n的范围
     */
    public int cuttingRopeExpand(int n) {
            BigInteger[] dp = new BigInteger[n + 1];
            Arrays.fill(dp, BigInteger.valueOf(1));
            // dp[1] = BigInteger.valueOf(1);
            for(int i = 3; i < n + 1; i++){
                for(int j = 1; j < i; j++){
                    dp[i] = dp[i].max(BigInteger.valueOf(j * (i - j))).max(dp[i - j].multiply(BigInteger.valueOf(j)));
                }
            }
            return dp[n].mod(BigInteger.valueOf(1000000007)).intValue();
        }

    /**
     * 拆3
     * @param n
     * @return
     */
    public int cuttingRopeThree(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        BigInteger result = BigInteger.valueOf(1);
        while (n > 4) {
            n -= 3;
            result = result.multiply(BigInteger.valueOf(3));
        }
        result = result.multiply(BigInteger.valueOf(n));
        return result.mod(BigInteger.valueOf(1000000007)).intValue();
    }
}
