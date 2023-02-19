package 剑指offer.扑克牌中的顺子;

import java.util.HashSet;
import java.util.Set;

public class Code {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for (int x : nums) {
            if (x == 0) {
                continue;
            }
            max = Math.max(max, x);
            min = Math.min(min, x);
            if(repeat.contains(x)) {
                return false;
            }
            repeat.add(x);
        }
        return max-min<5;
    }
}
