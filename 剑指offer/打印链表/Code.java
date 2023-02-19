package 剑指offer.打印链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Kohath
 * @desc 剑指offer2.06
 */
public class Code {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     */
    public int[] reversePrint1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int length = 0;
        while (head != null) {
            length = length + 1;
            stack.push(head.val);
            head = head.next;
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }

    //
    public int[] reversePrint2(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        ListNode p, q;
        p = head.next;
        head.next = null;
        int count = 1, i = 0;
        while (p != null) {
            count++;
            q = p.next;
            p.next = head;//将p插入head之前
            head = p;//调整head位置
            p = q;//调整p的位置
        }
        int[] ans = new int[count];
        p = head;
        while (p != null) {
            ans[i++] = p.val;
            p = p.next;
        }
        return ans;
    }

    public int[] reversePrint3(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        func(head, list);
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public void func(ListNode node, List<Integer> list) {
        if (node.next == null) {
            list.add(node.val);
            return;
        }
        func(node.next, list);
        list.add(node.val);
    }
}

