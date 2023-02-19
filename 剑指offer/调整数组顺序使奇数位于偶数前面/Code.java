package 剑指offer.调整数组顺序使奇数位于偶数前面;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kohath
 */
public class Code {
    public static void main(String[] args) {
        int[] exchange = new Code().exchange(new int[]{1, 2, 3, 4});
        for (int i : exchange) {
            System.out.println(i);
        }
    }

    public int[] exchange(int[] nums) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            //如果是奇数查看列表是否为空，不为空则交换
            if (nums[i] % 2 != 0 && !evenList.isEmpty()) {
                nums[i] = nums[i] ^ nums[evenList.get(0)];
                nums[evenList.get(0)] = nums[i] ^ nums[evenList.get(0)];
                nums[i] = nums[i] ^ nums[evenList.get(0)];
                evenList.remove(0);
            }
            if ((nums[i] % 2) == 0) {
                evenList.add(i);
            }
        }
        return nums;
    }

    /**
     * 双指针
     * @param nums
     * @return
     */
    public int[] exchangeD(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {

        }
        return nums;
    }

}
