package 剑指offer.滑动窗口最大值;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Code {
    /**
     * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
     * 输出: [3,3,5,5,6,7]
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        //会有nums.length -k +1个窗口
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1 - k, j = 0; j < nums.length; i++, j++) {
            if (i > 0 && deque.getFirst() == nums[i - 1]) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            if (i >= 0) {
                res[i] = deque.peekFirst();
            }
        }
        return res;
    }
}
