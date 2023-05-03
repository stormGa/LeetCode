package 题库刷.两数之和;

import java.util.HashMap;

public class twosum {

    public static int[] methodwithhash(int[] arr,int target){
        int[] answer = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>(arr.length);
        for(int i = 0;i<arr.length;i++){
            if (hashMap.containsKey(target-arr[i])){
                return new int[]{hashMap.get(target-arr[i]),i};
            }
            hashMap.put(arr[i], i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,11,2};
        int[] answer = methodwithhash(nums, 4);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
