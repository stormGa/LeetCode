package 剑指offer.求1n和;


public class Code {
    /**
     * 求1到n的和
     * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C)
     * 输入: n = 3
     * 输出: 6
     * @param n
     * @return
     */
    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 1;
        return n;
    }
}
