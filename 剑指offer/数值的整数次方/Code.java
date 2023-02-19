package 剑指offer.数值的整数次方;

/**
 * @author Kohath
 */
public class Code {

    /**
     * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
     * 输入：x = 2.00000, n = 10
     * 输出：1024.00000
     *
     * 递归快速幂
     *
     * @param x
     * @param n
     */
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n < 0) {
          x = 1/x;
          n = -n;
        }
        int b = n;
        double result = 1.0;
        while (b != 0) {
            if ((b & 1) == 1) {
                result = result * x;
            }
            x = x*x;
            b = b>>>1;
        }

        return  result;
    }

}
