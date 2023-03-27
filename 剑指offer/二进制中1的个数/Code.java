package 剑指offer.二进制中1的个数;

/**
 * @desc 位运算
 * @author Kohath
 */
public class Code {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                result = result + 1;
            }
            n = n >> 1;
        }
        return result;
    }
}
