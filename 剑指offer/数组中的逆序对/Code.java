package 剑指offer.数组中的逆序对;

/**
 * @author Kohath
 */
public class Code {
    /**
     * [7,5,6,4]
     *
     * @param nums
     * @return
     */
    public int reversePairs(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            res = res + numsGreat(nums, i, nums[i]);
        }
        return res;
    }

    private int numsGreat(int[] nums, int i, int target) {
        int res = 0;
        for (int j = 0; j < i; j++) {
            if (nums[j] > target) {
                res++;
            }
        }
        return res;
    }
}
