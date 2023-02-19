package 剑指offer.替换空格;

/**
 * @author Kohath
 * @desc <a href="https://leetcode.cn/problems/ti-huan-kong-ge-lcof/">剑指offer.替换空格</a>
 */
public class Code {

    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     *
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        if (s == null) {
            return null;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count = count + 1;
            }
        }
        int size = s.length() + 2 * count;
        char[] charArr = new char[size];
        for (int i = 0,j=0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                charArr[j++] = '%';
                charArr[j++] = '2';
                charArr[j++] = '0';
            }else {
                charArr[j++] = s.charAt(i);
            }
        }
        return String.valueOf(charArr);

    }
}
