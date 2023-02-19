package 剑指offer.连续子数组的最大和;

public class Code {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length+1];
        int max;
        dp[1] = nums[0];max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max( dp[i] + nums[i], nums[i]);
            if (dp[i + 1] > max) {
                max = dp[i + 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = new Code().maxSubArray(arr);
        System.out.println(i);
    }
}
