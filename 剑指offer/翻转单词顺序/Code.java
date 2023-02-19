package 剑指offer.翻转单词顺序;

import java.util.Arrays;

public class Code {
    /**
     * 例如输入字符串"I am a student. "，则输出"student. a am I"
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        StringBuffer res = new StringBuffer();
        s = s.strip();
        String[] s1 = s.split(" ");
        int i = 0, j = s1.length - 1;
        while (j>=0) {
            if (!"".equals(s1[j])) {
                res.append(s1[j]).append(" ");
            }
            j--;
        }
        return String.valueOf(res).strip();
    }

    public static void main(String[] args) {
        String s = new Code().reverseWords("a good   example");
        System.out.println(s);
    }
}
