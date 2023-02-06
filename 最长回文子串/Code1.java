package 最长回文子串;

/**
 * @author Kohath
 *
 * @desc 给你一个字符串 s，找到 s 中最长的回文子串。
         如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
   @example s = "babad"   output = "bab"
   @solution 暴力破解
         
 */
public class Code1 {

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        // s.charAt(i) 每次都会检查数组下标越界，因此先转换成字符数组
        char[] charArray = s.toCharArray();

        // 枚举所有长度大于 1 的子串 charArray[i..j]
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && validPalindromic(charArray, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    /**
     * 验证子串 s[left..right] 是否为回文串
     */
    private static boolean validPalindromic(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    
    public static void main(String[] args) {
        String s = "babad";
        String maxString = longestPalindrome(s);
        System.out.println(maxString);
    }
}
