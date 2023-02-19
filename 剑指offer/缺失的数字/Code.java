package 剑指offer.缺失的数字;

public class Code {


    private int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1, mid;
        while (i <= j) {
            mid = (i + j) / 2;
            if (nums[mid] == mid) {
                i = mid+1;
            }else {
                j = mid-1;
            }
        }
        return i;
    }
}

