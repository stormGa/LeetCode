package 剑指offer.数组中出现次数超过一半的数字;

/**
 * @author Kohath
 */
public class Code {

    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * @param nums [1, 2, 3, 2, 2, 2, 5, 4, 2]
     * @return  2
     */
    public int majorityElement(int[] nums) {
        int votes = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (votes == 0) {
                num = nums[i];
            }
            if (num == nums[i]) {
                votes++;
            }else {
                votes--;
            }
        }
        return num;
    }


}
