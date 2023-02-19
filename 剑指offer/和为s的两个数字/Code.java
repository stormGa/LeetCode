package 剑指offer.和为s的两个数字;

public class Code {
    public int[] twoSum(int[] nums, int target) {
        int begin = 0, end = nums.length-1, mid;
        while (begin < end) {
            mid = (begin + end) / 2;
            if (nums[mid] <= target) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        int i = 0, j = begin;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[]{nums[i], nums[j]};
            }
            if (nums[i] + nums[j] < target) {
                i++;
            }
            if (nums[i] + nums[j] > target) {
                j--;
            }
        }
        return new int[0];
    }

    /**
     * 返回下标
     *
     * @param nums
     * @param target
     * @return
     */
    private int findRange(int[] nums, int target, int l, int r) {
        int begin = l, end = r, mid;
        while (begin < end) {
            mid = (begin + end) / 2;
            if (nums[mid] <= target) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return begin;
    }

    public static void main(String[] args) {
        int[] nums = {16,16,18,24,30,32};
        for (int i : new Code().twoSum(nums, 48)) {
            System.out.println(i);
        }

    }
}
