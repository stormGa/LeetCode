package 剑指offer.和为s的连续正数序列;

import java.util.ArrayList;
import java.util.List;

public class Code {
    /**
     * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
     * <p>
     * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
     * <p>
     * 示例 1：
     * 输入：target = 9
     * 输出：[[2,3,4],[4,5]]
     * 示例 2：
     * 输入：target = 15
     * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
     *
     * @param target
     * @return
     */
    public int[][] findContinuousSequence(int target) {
        int l = 1, r = 1, sum = 0;
        List<Integer> list = new ArrayList<>();
        while (l <= target / 2) {
            if (sum < target) {
                sum = sum + r;
                r++;
            } else if (sum > target) {
                sum = sum - l;
                l++;
            }else {
                //添加到list
            }
        }
        return new int[0][0];
    }
}
