package 剑指offer.数组中数字出现的次数;

public class Code {
    public int[] singleNumbers(int[] nums) {
        int eor = 0;
        for (int num : nums) {
            eor = eor ^ num;
        }
        int one = eor & (~eor + 1);
        int two = 0;
        for (int x : nums) {
            if ((x & one) == 0) {
                two = two ^ x;
            }
        }
        return new int[]{two, eor^two};
    }
}
