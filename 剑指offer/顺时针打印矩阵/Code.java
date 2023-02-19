package 剑指offer.顺时针打印矩阵;

import java.util.Arrays;

/**
 * @author Kohath
 */
public class Code {
    public static void main(String[] args) {
        int[][] martix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] martix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] martix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},{13,14,15,16}};
        int[] ints = new Code().spiralOrder(martix);
        for (int i : ints
        ) {
            System.out.println(i);
        }
    }
    int recur = 0,a,b,c,d;
    int[] arr;
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int size = m*n;
        arr = new int[size];
        a = n;b = m;c = 0; d = 0;int flag=0;
        while (recur!=size){
            getReslut(matrix,flag++%4);
        }
        return arr;
    }

    private void getReslut(int[][] matrix,int flag) {
        if (flag == 0) {
            for (int i = 0; i <a ; i++) {
                arr[recur++] = matrix[c][d+i];
            }
            b--;c++;
        }
        if (flag == 1) {
            for (int i = 0; i < b; i++) {
                arr[recur++] = matrix[c + i][d + a-1];
            }
            a--;
        }
        if (flag == 2) {
            for (int i = 0; i < a; i++) {
                arr[recur++] = matrix[c+b-1 ][d + a-i-1];
            }
            b--;
        }
        if (flag == 3) {
            for (int i = 0; i < b; i++) {
                arr[recur++] = matrix[c+b-i-1 ][d ];
            }
            a--;d++;
        }
    }
}