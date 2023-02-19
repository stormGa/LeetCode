package 剑指offer.构建乘积数组;

public class Code {
    public int[] constructArr(int[] a) {
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        left[0] = 1; right[a.length-1] = 1;
        for (int i = 1; i < a.length; i++) {
            left[i] = left[i - 1] * a[i-1];
        }
        for (int i = a.length-2; i >=0 ; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
