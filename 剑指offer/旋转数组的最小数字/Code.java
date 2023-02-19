package 剑指offer.旋转数组的最小数字;

/**
 * @author Kohath
 */
public class Code {

    /**
     * 输入：numbers = [3,4,5,1,2]
     * 输出：1
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }

    /**
     * 二分法
     * @param numbers
     * @return
     */
    public int minArray1(int[] numbers) {
        int left = 0, right = numbers.length - 1,mid = 0;
        while (left < right) {
            mid = (left + right ) /2;
            if (numbers[mid] >numbers[right]) {
                left = mid+1;
            }else if(numbers[mid] >numbers[right]) {
                right = mid;
            }else {
                right--;
            }
        }
        return numbers[mid];

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int i = new Code().minArray1(arr);
        System.out.println(i);
    }
}
