package 剑指offer.左旋转字符串;

public class Code {
    /**
     * 输入: s = "abcdefg", k = 2
     * 输出: "cdefgab"
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        char[] c1 = new char[n];
        char[] c2 = new char[chars.length - n];
        for (int i = 0; i < chars.length; i++) {
            if (i < n) {
                c1[i] = chars[i];
            } else {
                c2[i - n] = chars[i];
            }
        }
        return String.valueOf(c2) + String.valueOf(c1);
    }
}
