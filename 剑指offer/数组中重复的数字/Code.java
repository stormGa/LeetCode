package 剑指offer.数组中重复的数字;

/**
 * @author Kohath
 */
public class Code {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        new Code().findRepeatNumber2(nums);
    }
    /**
     * 找出数组中重复的数字  0～n-1
     */
    public int findRepeatNumber1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    /**
     * 原地置换
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                i = i - 1;
                continue;
            }
            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
