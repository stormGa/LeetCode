package 剑指offer.最小的k个数;

import java.util.Arrays;

/**
 * @author Kohath
 */
public class Code {
    /**
     * 输入整数数组 arr ，
     * 找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，
     * 则最小的4个数字是1、2、3、4。
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        int[] min = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            min[i] = arr[i];
        }
        return min;
    }

    /**
     * 快速排序
     */
    public int[] getLeastNumbers1(int[] arr, int k) {
        return new int[0];
    }

    public int[] quickSort(int[] arr, int low, int high, int k) {
        // low,high 为每次处理数组时的首、尾元素索引

        //当low==high是表示该序列只有一个元素，不必排序了
        if (low >= high) {
            return arr;
        }
        // 选出哨兵元素和基准元素。这里左边的哨兵元素也是基准元素
        int i = low, j = high, base = arr[low];
        while (i < j) {
            //右边哨兵从后向前找
            while (arr[j] >= base && i < j) {
                j--;
            }
            //左边哨兵从前向后找
            while (arr[i] <= base && i < j) {
                i++;
            }
            //交换元素
            swap(arr,i,j);
        }
        //基准元素与右哨兵交换
        swap(arr,low,j);

        //递归调用，排序左子集合和右子集合
        if (i < k) {

            quickSort(arr, low, j - 1,k);
            quickSort(arr,j+1,high,k);
        }
       return Arrays.copyOf(arr,k);
    }



    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 3, 5,1,-1};
        int[] ints = new Code().quickSort(arr, 0, arr.length - 1, 3);
        for (int x: ints
             ) {
            System.out.println(x);
        }
        for (int x: arr
             ) {
            System.out.println(x);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
