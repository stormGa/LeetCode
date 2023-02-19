package 剑指offer.第一个只出现一次的字符;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kohath
 */
public class Code {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Boolean> map = new HashMap<>(100);
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], false);
            } else {
                map.put(chars[i], true);
            }
        }
        for (char c : chars) {
            if (map.get(c)) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        new Code().firstUniqChar("leetcode");
    }
}
