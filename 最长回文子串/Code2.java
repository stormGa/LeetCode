package 最长回文子串;

/**
 * @author Kohath
 * @solution 二维动态规划
 */
public class Code2 {
    private static final int MIN_LEN = 2;

    public static void main(String[] args) {
        String s = "babad";
        String maxString = longestPalindrome(s);
        System.out.println(maxString);
    }

    /**
     * @desc 判断是否是回文串
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

    /**
     * @param s 字符串
     * @return 返回最长回文子串
     * @desc 二维动态规划
     */
    private static String longestPalindrome(String s) {
        //特殊情况判断,只有一个字符。
        int len = s.length();
        if (len < MIN_LEN) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        char[] charArray = s.toCharArray();
        // 定义dp数组,并初始化
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        //动态规划
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    //如果去掉头尾不构成区间<2  ===> j- 1 -(i+1)+1 <2 ===> j-i <3
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        //dp(0,5) = dp(1,4)
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                //dp[i][j]是true的话，表示是回文
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin + maxLen);
    }
}
